package com.mbridge.msdk.playercommon.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import q4.a;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int ERROR_BAD_VALUE = -2;
    private static final long MAX_BUFFER_DURATION_US = 750000;
    private static final long MIN_BUFFER_DURATION_US = 250000;
    private static final int MODE_STATIC = 0;
    private static final int MODE_STREAM = 1;
    private static final long PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int START_IN_SYNC = 1;
    private static final int START_NEED_SYNC = 2;
    private static final int START_NOT_SET = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final String TAG = "AudioTrack";

    @SuppressLint({"InlinedApi"})
    private static final int WRITE_NON_BLOCKING = 1;
    public static boolean enablePreV21AudioSessionWorkaround = false;
    public static boolean failOnSpuriousAudioTimestamp = false;
    private AudioProcessor[] activeAudioProcessors;

    @Nullable
    private PlaybackParameters afterDrainPlaybackParameters;
    private AudioAttributes audioAttributes;

    @Nullable
    private final AudioCapabilities audioCapabilities;
    private final AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private AudioTrack audioTrack;
    private final AudioTrackPositionTracker audioTrackPositionTracker;

    @Nullable
    private ByteBuffer avSyncHeader;
    private int bufferSize;
    private int bytesUntilNextAvSync;
    private boolean canApplyPlaybackParameters;
    private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private int drainingAudioProcessorIndex;
    private final boolean enableConvertHighResIntPcmToFloat;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;

    @Nullable
    private ByteBuffer inputBuffer;
    private int inputSampleRate;
    private boolean isInputPcm;

    @Nullable
    private AudioTrack keepSessionIdAudioTrack;
    private long lastFeedElapsedRealtimeMs;

    @Nullable
    private AudioSink.Listener listener;

    @Nullable
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;
    private int outputChannelConfig;
    private int outputEncoding;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private int pcmFrameSize;
    private PlaybackParameters playbackParameters;
    private final ArrayDeque<PlaybackParametersCheckpoint> playbackParametersCheckpoints;
    private long playbackParametersOffsetUs;
    private long playbackParametersPositionUs;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private boolean processingEnabled;
    private final ConditionVariable releasingConditionVariable;
    private boolean shouldConvertHighResIntPcmToFloat;
    private int startMediaTimeState;
    private long startMediaTimeUs;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface AudioProcessorChain {
        PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j10);

        long getSkippedOutputFrameCount();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            AudioProcessor[] audioProcessorArr2 = (AudioProcessor[]) Arrays.copyOf(audioProcessorArr, audioProcessorArr.length + 2);
            this.audioProcessors = audioProcessorArr2;
            SilenceSkippingAudioProcessor silenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            SonicAudioProcessor sonicAudioProcessor = new SonicAudioProcessor();
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.silenceSkippingAudioProcessor.setEnabled(playbackParameters.skipSilence);
            return new PlaybackParameters(this.sonicAudioProcessor.setSpeed(playbackParameters.speed), this.sonicAudioProcessor.setPitch(playbackParameters.pitch), playbackParameters.skipSilence);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getMediaDuration(long j10) {
            return this.sonicAudioProcessor.scaleDurationForSpeedup(j10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class PlaybackParametersCheckpoint {
        private final long mediaTimeUs;
        private final PlaybackParameters playbackParameters;
        private final long positionUs;

        private PlaybackParametersCheckpoint(PlaybackParameters playbackParameters, long j10, long j11) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j10;
            this.positionUs = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class PositionTrackerListener implements AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j10) {
            Log.w(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            StringBuilder sbL = d.l(j10, "Spurious audio timestamp (frame position mismatch): ", ", ");
            sbL.append(j11);
            a.r(sbL, ", ", j12, ", ");
            sbL.append(j13);
            sbL.append(", ");
            sbL.append(DefaultAudioSink.this.getSubmittedFrames());
            sbL.append(", ");
            sbL.append(DefaultAudioSink.this.getWrittenFrames());
            String string = sbL.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w(DefaultAudioSink.TAG, string);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            StringBuilder sbL = d.l(j10, "Spurious audio timestamp (system clock mismatch): ", ", ");
            sbL.append(j11);
            a.r(sbL, ", ", j12, ", ");
            sbL.append(j13);
            sbL.append(", ");
            sbL.append(DefaultAudioSink.this.getSubmittedFrames());
            sbL.append(", ");
            sbL.append(DefaultAudioSink.this.getWrittenFrames());
            String string = sbL.toString();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(string);
            }
            Log.w(DefaultAudioSink.TAG, string);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StartMediaTimeState {
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr) {
        this(audioCapabilities, audioProcessorArr, false);
    }

    private long applySkipping(long j10) {
        return j10 + framesToDurationUs(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    private long applySpeedup(long j10) {
        long j11;
        long mediaDurationForPlayoutDuration;
        PlaybackParametersCheckpoint playbackParametersCheckpointRemove = null;
        while (!this.playbackParametersCheckpoints.isEmpty() && j10 >= this.playbackParametersCheckpoints.getFirst().positionUs) {
            playbackParametersCheckpointRemove = this.playbackParametersCheckpoints.remove();
        }
        if (playbackParametersCheckpointRemove != null) {
            this.playbackParameters = playbackParametersCheckpointRemove.playbackParameters;
            this.playbackParametersPositionUs = playbackParametersCheckpointRemove.positionUs;
            this.playbackParametersOffsetUs = playbackParametersCheckpointRemove.mediaTimeUs - this.startMediaTimeUs;
        }
        if (this.playbackParameters.speed == 1.0f) {
            return (j10 + this.playbackParametersOffsetUs) - this.playbackParametersPositionUs;
        }
        if (this.playbackParametersCheckpoints.isEmpty()) {
            j11 = this.playbackParametersOffsetUs;
            mediaDurationForPlayoutDuration = this.audioProcessorChain.getMediaDuration(j10 - this.playbackParametersPositionUs);
        } else {
            j11 = this.playbackParametersOffsetUs;
            mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j10 - this.playbackParametersPositionUs, this.playbackParameters.speed);
        }
        return mediaDurationForPlayoutDuration + j11;
    }

    @TargetApi(21)
    private AudioTrack createAudioTrackV21() {
        android.media.AudioAttributes audioAttributesBuild = this.tunneling ? new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.audioAttributes.getAudioAttributesV21();
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.outputChannelConfig).setEncoding(this.outputEncoding).setSampleRate(this.outputSampleRate).build();
        int i10 = this.audioSessionId;
        if (i10 == 0) {
            i10 = 0;
        }
        return new AudioTrack(audioAttributesBuild, audioFormatBuild, this.bufferSize, 1, i10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean drainAudioProcessorsToEndOfStream() throws com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.drainingAudioProcessorIndex
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.processingEnabled
            if (r0 == 0) goto Ld
            r0 = r2
            goto L10
        Ld:
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor[] r0 = r9.activeAudioProcessors
            int r0 = r0.length
        L10:
            r9.drainingAudioProcessorIndex = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.drainingAudioProcessorIndex
            com.mbridge.msdk.playercommon.exoplayer2.audio.AudioProcessor[] r5 = r9.activeAudioProcessors
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.queueEndOfStream()
        L28:
            r9.processBuffers(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.drainingAudioProcessorIndex
            int r0 = r0 + r1
            r9.drainingAudioProcessorIndex = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L44
            r9.writeBuffer(r0, r7)
            java.nio.ByteBuffer r0 = r9.outputBuffer
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.drainingAudioProcessorIndex = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.drainAudioProcessorsToEndOfStream():boolean");
    }

    private long durationUsToFrames(long j10) {
        return (j10 * ((long) this.outputSampleRate)) / 1000000;
    }

    private void flushAudioProcessors() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.outputBuffers[i10] = audioProcessor.getOutput();
            i10++;
        }
    }

    private long framesToDurationUs(long j10) {
        return (j10 * 1000000) / ((long) this.outputSampleRate);
    }

    private AudioProcessor[] getAvailableAudioProcessors() {
        return this.shouldConvertHighResIntPcmToFloat ? this.toFloatPcmAvailableAudioProcessors : this.toIntPcmAvailableAudioProcessors;
    }

    private static int getFramesPerEncodedSample(int i10, ByteBuffer byteBuffer) {
        if (i10 == 7 || i10 == 8) {
            return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
        }
        if (i10 == 5) {
            return Ac3Util.getAc3SyncframeAudioSampleCount();
        }
        if (i10 == 6) {
            return Ac3Util.parseEAc3SyncframeAudioSampleCount(byteBuffer);
        }
        if (i10 != 14) {
            throw new IllegalStateException(l1.d.e(i10, "Unexpected audio encoding: "));
        }
        int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
        if (iFindTrueHdSyncframeOffset == -1) {
            return 0;
        }
        return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        return this.isInputPcm ? this.submittedPcmBytes / ((long) this.pcmFrameSize) : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        return this.isInputPcm ? this.writtenPcmBytes / ((long) this.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private void initialize() throws AudioSink.InitializationException {
        this.releasingConditionVariable.block();
        AudioTrack audioTrackInitializeAudioTrack = initializeAudioTrack();
        this.audioTrack = audioTrackInitializeAudioTrack;
        int audioSessionId = audioTrackInitializeAudioTrack.getAudioSessionId();
        if (enablePreV21AudioSessionWorkaround && Util.SDK_INT < 21) {
            AudioTrack audioTrack = this.keepSessionIdAudioTrack;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                releaseKeepSessionIdAudioTrack();
            }
            if (this.keepSessionIdAudioTrack == null) {
                this.keepSessionIdAudioTrack = initializeKeepSessionIdAudioTrack(audioSessionId);
            }
        }
        if (this.audioSessionId != audioSessionId) {
            this.audioSessionId = audioSessionId;
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSessionId(audioSessionId);
            }
        }
        this.playbackParameters = this.canApplyPlaybackParameters ? this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters) : PlaybackParameters.DEFAULT;
        setupAudioProcessors();
        this.audioTrackPositionTracker.setAudioTrack(this.audioTrack, this.outputEncoding, this.outputPcmFrameSize, this.bufferSize);
        setVolumeInternal();
    }

    private AudioTrack initializeAudioTrack() throws AudioSink.InitializationException {
        AudioTrack audioTrack;
        if (Util.SDK_INT >= 21) {
            audioTrack = createAudioTrackV21();
        } else {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(this.audioAttributes.usage);
            audioTrack = this.audioSessionId == 0 ? new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1) : new AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, this.audioSessionId);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize);
    }

    private AudioTrack initializeKeepSessionIdAudioTrack(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    private long inputFramesToDurationUs(long j10) {
        return (j10 * 1000000) / ((long) this.inputSampleRate);
    }

    private boolean isInitialized() {
        return this.audioTrack != null;
    }

    private void processBuffers(long j10) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.outputBuffers[i10 - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i10 == length) {
                writeBuffer(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.activeAudioProcessors[i10];
                audioProcessor.queueInput(byteBuffer);
                ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i10] = output;
                if (output.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    private void releaseKeepSessionIdAudioTrack() {
        final AudioTrack audioTrack = this.keepSessionIdAudioTrack;
        if (audioTrack == null) {
            return;
        }
        this.keepSessionIdAudioTrack = null;
        new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                audioTrack.release();
            }
        }.start();
    }

    private void setVolumeInternal() {
        if (isInitialized()) {
            if (Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    @TargetApi(21)
    private static void setVolumeInternalV21(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void setupAudioProcessors() {
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : getAvailableAudioProcessors()) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.outputBuffers = new ByteBuffer[size];
        flushAudioProcessors();
    }

    private void writeBuffer(ByteBuffer byteBuffer, long j10) throws AudioSink.WriteException {
        DefaultAudioSink defaultAudioSink;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.outputBuffer;
            int iWriteNonBlockingV21 = 0;
            if (byteBuffer2 != null) {
                Assertions.checkArgument(byteBuffer2 == byteBuffer);
            } else {
                this.outputBuffer = byteBuffer;
                if (Util.SDK_INT < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.preV21OutputBuffer = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Util.SDK_INT < 21) {
                int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
                if (availableBufferSize > 0) {
                    iWriteNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(iRemaining2, availableBufferSize));
                    if (iWriteNonBlockingV21 > 0) {
                        this.preV21OutputBufferOffset += iWriteNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                    }
                }
                defaultAudioSink = this;
            } else if (this.tunneling) {
                Assertions.checkState(j10 != C.TIME_UNSET);
                defaultAudioSink = this;
                iWriteNonBlockingV21 = defaultAudioSink.writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer, iRemaining2, j10);
            } else {
                defaultAudioSink = this;
                iWriteNonBlockingV21 = writeNonBlockingV21(defaultAudioSink.audioTrack, byteBuffer, iRemaining2);
            }
            defaultAudioSink.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
            if (iWriteNonBlockingV21 < 0) {
                throw new AudioSink.WriteException(iWriteNonBlockingV21);
            }
            boolean z10 = defaultAudioSink.isInputPcm;
            if (z10) {
                defaultAudioSink.writtenPcmBytes += (long) iWriteNonBlockingV21;
            }
            if (iWriteNonBlockingV21 == iRemaining2) {
                if (!z10) {
                    defaultAudioSink.writtenEncodedFrames += (long) defaultAudioSink.framesPerEncodedSample;
                }
                defaultAudioSink.outputBuffer = null;
            }
        }
    }

    @TargetApi(21)
    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @TargetApi(21)
    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i10);
            this.avSyncHeader.putLong(8, j10 * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i10;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i10);
        if (iWriteNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x015e  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x004b, please report this as an issue */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void configure(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, int i15) throws AudioSink.ConfigurationException {
        int outputEncoding;
        boolean z10;
        boolean z11;
        int outputSampleRateHz;
        boolean zConfigure;
        int outputChannelCount;
        int i16;
        int i17;
        int i18;
        int pcmFrameSize;
        int i19;
        int i20;
        this.inputSampleRate = i12;
        this.isInputPcm = Util.isEncodingPcm(i10);
        this.shouldConvertHighResIntPcmToFloat = this.enableConvertHighResIntPcmToFloat && isEncodingSupported(1073741824) && Util.isEncodingHighResolutionIntegerPcm(i10);
        if (this.isInputPcm) {
            this.pcmFrameSize = Util.getPcmFrameSize(i10, i11);
        }
        int i21 = 4;
        if (this.isInputPcm) {
            outputEncoding = i10;
            z10 = outputEncoding != 4;
            if (z10 || this.shouldConvertHighResIntPcmToFloat) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.canApplyPlaybackParameters = z11;
            if (z10) {
                this.trimmingAudioProcessor.setTrimFrameCount(i14, i15);
                this.channelMappingAudioProcessor.setChannelMap(iArr);
                outputSampleRateHz = i12;
                zConfigure = false;
                outputChannelCount = i11;
                for (AudioProcessor audioProcessor : getAvailableAudioProcessors()) {
                    try {
                        zConfigure |= audioProcessor.configure(outputSampleRateHz, outputChannelCount, outputEncoding);
                        if (audioProcessor.isActive()) {
                            outputChannelCount = audioProcessor.getOutputChannelCount();
                            outputSampleRateHz = audioProcessor.getOutputSampleRateHz();
                            outputEncoding = audioProcessor.getOutputEncoding();
                        }
                    } catch (AudioProcessor.UnhandledFormatException e10) {
                        throw new AudioSink.ConfigurationException(e10);
                    }
                }
            } else {
                outputSampleRateHz = i12;
                zConfigure = false;
                outputChannelCount = i11;
            }
            i16 = 252;
            switch (outputChannelCount) {
                case 1:
                    break;
                case 2:
                    i21 = 12;
                    break;
                case 3:
                    i21 = 28;
                    break;
                case 4:
                    i21 = 204;
                    break;
                case 5:
                    i21 = 220;
                    break;
                case 6:
                    i21 = 252;
                    break;
                case 7:
                    i21 = 1276;
                    break;
                case 8:
                    i21 = C.CHANNEL_OUT_7POINT1_SURROUND;
                    break;
                default:
                    throw new AudioSink.ConfigurationException(l1.d.e(outputChannelCount, "Unsupported channel count: "));
            }
            i17 = Util.SDK_INT;
            if (i17 <= 23 || !"foster".equals(Util.DEVICE) || !"NVIDIA".equals(Util.MANUFACTURER)) {
                i16 = i21;
            } else if (outputChannelCount != 3 && outputChannelCount != 5) {
                if (outputChannelCount != 7) {
                    i16 = i21;
                } else {
                    i16 = C.CHANNEL_OUT_7POINT1_SURROUND;
                }
            }
            i18 = (i17 <= 25 || !"fugu".equals(Util.DEVICE) || this.isInputPcm || outputChannelCount != 1) ? i16 : 12;
            if (zConfigure && isInitialized() && this.outputEncoding == outputEncoding && this.outputSampleRate == outputSampleRateHz && this.outputChannelConfig == i18) {
                return;
            }
            reset();
            this.processingEnabled = z10;
            this.outputSampleRate = outputSampleRateHz;
            this.outputChannelConfig = i18;
            this.outputEncoding = outputEncoding;
            if (this.isInputPcm) {
                pcmFrameSize = Util.getPcmFrameSize(outputEncoding, outputChannelCount);
            } else {
                pcmFrameSize = -1;
            }
            this.outputPcmFrameSize = pcmFrameSize;
            if (i13 != 0) {
                this.bufferSize = i13;
                return;
            }
            if (this.isInputPcm) {
                int minBufferSize = AudioTrack.getMinBufferSize(outputSampleRateHz, i18, this.outputEncoding);
                Assertions.checkState(minBufferSize != -2);
                this.bufferSize = Util.constrainValue(minBufferSize * 4, ((int) durationUsToFrames(250000L)) * this.outputPcmFrameSize, (int) Math.max(minBufferSize, durationUsToFrames(MAX_BUFFER_DURATION_US) * ((long) this.outputPcmFrameSize)));
            }
            i19 = this.outputEncoding;
            if (i19 == 5 && i19 != 6) {
                if (i19 == 7) {
                    this.bufferSize = 49152;
                    return;
                } else {
                    this.bufferSize = 294912;
                    return;
                }
            }
            this.bufferSize = CacheDataSink.DEFAULT_BUFFER_SIZE;
        }
        outputEncoding = i10;
        if (z10) {
            z11 = false;
        } else {
            z11 = false;
        }
        this.canApplyPlaybackParameters = z11;
        if (z10) {
            this.trimmingAudioProcessor.setTrimFrameCount(i14, i15);
            this.channelMappingAudioProcessor.setChannelMap(iArr);
            outputSampleRateHz = i12;
            zConfigure = false;
            outputChannelCount = i11;
            while (i20 < r9) {
                zConfigure |= audioProcessor.configure(outputSampleRateHz, outputChannelCount, outputEncoding);
                if (audioProcessor.isActive()) {
                    outputChannelCount = audioProcessor.getOutputChannelCount();
                    outputSampleRateHz = audioProcessor.getOutputSampleRateHz();
                    outputEncoding = audioProcessor.getOutputEncoding();
                }
            }
        } else {
            outputSampleRateHz = i12;
            zConfigure = false;
            outputChannelCount = i11;
        }
        i16 = 252;
        switch (outputChannelCount) {
            case 1:
                break;
            case 2:
                i21 = 12;
                break;
            case 3:
                i21 = 28;
                break;
            case 4:
                i21 = 204;
                break;
            case 5:
                i21 = 220;
                break;
            case 6:
                i21 = 252;
                break;
            case 7:
                i21 = 1276;
                break;
            case 8:
                i21 = C.CHANNEL_OUT_7POINT1_SURROUND;
                break;
            default:
                throw new AudioSink.ConfigurationException(l1.d.e(outputChannelCount, "Unsupported channel count: "));
        }
        i17 = Util.SDK_INT;
        if (i17 <= 23) {
            i16 = i21;
        } else {
            i16 = i21;
        }
        if (i17 <= 25) {
        }
        if (zConfigure) {
        }
        reset();
        this.processingEnabled = z10;
        this.outputSampleRate = outputSampleRateHz;
        this.outputChannelConfig = i18;
        this.outputEncoding = outputEncoding;
        if (this.isInputPcm) {
            pcmFrameSize = Util.getPcmFrameSize(outputEncoding, outputChannelCount);
        } else {
            pcmFrameSize = -1;
        }
        this.outputPcmFrameSize = pcmFrameSize;
        if (i13 != 0) {
            this.bufferSize = i13;
            return;
        }
        if (this.isInputPcm) {
            int minBufferSize2 = AudioTrack.getMinBufferSize(outputSampleRateHz, i18, this.outputEncoding);
            Assertions.checkState(minBufferSize2 != -2);
            this.bufferSize = Util.constrainValue(minBufferSize2 * 4, ((int) durationUsToFrames(250000L)) * this.outputPcmFrameSize, (int) Math.max(minBufferSize2, durationUsToFrames(MAX_BUFFER_DURATION_US) * ((long) this.outputPcmFrameSize)));
        } else {
            i19 = this.outputEncoding;
            if (i19 == 5) {
            }
            this.bufferSize = CacheDataSink.DEFAULT_BUFFER_SIZE;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            this.audioSessionId = 0;
            reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void enableTunnelingV21(int i10) {
        Assertions.checkState(Util.SDK_INT >= 21);
        if (this.tunneling && this.audioSessionId == i10) {
            return;
        }
        this.tunneling = true;
        this.audioSessionId = i10;
        reset();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (!isInitialized() || this.startMediaTimeState == 0) {
            return Long.MIN_VALUE;
        }
        return this.startMediaTimeUs + applySkipping(applySpeedup(Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z10), framesToDurationUs(getWrittenFrames()))));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10) throws AudioSink.InitializationException, AudioSink.WriteException {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        boolean z10 = false;
        Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!isInitialized()) {
            initialize();
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer != null) {
            z10 = false;
        } else {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.isInputPcm && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(this.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainPlaybackParameters != null) {
                if (!drainAudioProcessorsToEndOfStream()) {
                    return false;
                }
                PlaybackParameters playbackParameters = this.afterDrainPlaybackParameters;
                this.afterDrainPlaybackParameters = null;
                this.playbackParametersCheckpoints.add(new PlaybackParametersCheckpoint(this.audioProcessorChain.applyPlaybackParameters(playbackParameters), Math.max(0L, j10), framesToDurationUs(getWrittenFrames())));
                setupAudioProcessors();
            }
            if (this.startMediaTimeState == 0) {
                this.startMediaTimeUs = Math.max(0L, j10);
                this.startMediaTimeState = 1;
            } else {
                long jInputFramesToDurationUs = this.startMediaTimeUs + inputFramesToDurationUs(getSubmittedFrames());
                if (this.startMediaTimeState == 1 && Math.abs(jInputFramesToDurationUs - j10) > 200000) {
                    StringBuilder sbL = d.l(jInputFramesToDurationUs, "Discontinuity detected [expected ", ", got ");
                    sbL.append(j10);
                    sbL.append(X3.j.f27836e);
                    Log.e(TAG, sbL.toString());
                    this.startMediaTimeState = 2;
                }
                if (this.startMediaTimeState == 2) {
                    this.startMediaTimeUs = (j10 - jInputFramesToDurationUs) + this.startMediaTimeUs;
                    this.startMediaTimeState = 1;
                    AudioSink.Listener listener = this.listener;
                    if (listener != null) {
                        listener.onPositionDiscontinuity();
                    }
                }
            }
            if (this.isInputPcm) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += (long) this.framesPerEncodedSample;
            }
            this.inputBuffer = byteBuffer;
        }
        if (this.processingEnabled) {
            processBuffers(j10);
        } else {
            writeBuffer(this.inputBuffer, j10);
        }
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            return true;
        }
        if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return z10;
        }
        Log.w(TAG, "Resetting stalled audio track");
        reset();
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        if (this.startMediaTimeState == 1) {
            this.startMediaTimeState = 2;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        return isInitialized() && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public boolean isEncodingSupported(int i10) {
        if (Util.isEncodingPcm(i10)) {
            return i10 != 4 || Util.SDK_INT >= 21;
        }
        AudioCapabilities audioCapabilities = this.audioCapabilities;
        return audioCapabilities != null && audioCapabilities.supportsEncoding(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        if (isInitialized()) {
            return this.handledEndOfStream && !hasPendingData();
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isInitialized() && this.audioTrackPositionTracker.pause()) {
            this.audioTrack.pause();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.handledEndOfStream && isInitialized() && drainAudioProcessorsToEndOfStream()) {
            this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
            this.audioTrack.stop();
            this.bytesUntilNextAvSync = 0;
            this.handledEndOfStream = true;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void release() {
        reset();
        releaseKeepSessionIdAudioTrack();
        for (AudioProcessor audioProcessor : this.toIntPcmAvailableAudioProcessors) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.toFloatPcmAvailableAudioProcessors) {
            audioProcessor2.reset();
        }
        this.audioSessionId = 0;
        this.playing = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void reset() {
        if (isInitialized()) {
            this.submittedPcmBytes = 0L;
            this.submittedEncodedFrames = 0L;
            this.writtenPcmBytes = 0L;
            this.writtenEncodedFrames = 0L;
            this.framesPerEncodedSample = 0;
            PlaybackParameters playbackParameters = this.afterDrainPlaybackParameters;
            if (playbackParameters != null) {
                this.playbackParameters = playbackParameters;
                this.afterDrainPlaybackParameters = null;
            } else if (!this.playbackParametersCheckpoints.isEmpty()) {
                this.playbackParameters = this.playbackParametersCheckpoints.getLast().playbackParameters;
            }
            this.playbackParametersCheckpoints.clear();
            this.playbackParametersOffsetUs = 0L;
            this.playbackParametersPositionUs = 0L;
            this.inputBuffer = null;
            this.outputBuffer = null;
            flushAudioProcessors();
            this.handledEndOfStream = false;
            this.drainingAudioProcessorIndex = -1;
            this.avSyncHeader = null;
            this.bytesUntilNextAvSync = 0;
            this.startMediaTimeState = 0;
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            final AudioTrack audioTrack = this.audioTrack;
            this.audioTrack = null;
            this.audioTrackPositionTracker.reset();
            this.releasingConditionVariable.close();
            new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.audio.DefaultAudioSink.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        DefaultAudioSink.this.releasingConditionVariable.open();
                    }
                }
            }.start();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        reset();
        this.audioSessionId = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i10) {
        if (this.audioSessionId != i10) {
            this.audioSessionId = i10;
            reset();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public PlaybackParameters setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (isInitialized() && !this.canApplyPlaybackParameters) {
            PlaybackParameters playbackParameters2 = PlaybackParameters.DEFAULT;
            this.playbackParameters = playbackParameters2;
            return playbackParameters2;
        }
        PlaybackParameters playbackParameters3 = this.afterDrainPlaybackParameters;
        if (playbackParameters3 == null) {
            playbackParameters3 = !this.playbackParametersCheckpoints.isEmpty() ? this.playbackParametersCheckpoints.getLast().playbackParameters : this.playbackParameters;
        }
        if (!playbackParameters.equals(playbackParameters3)) {
            if (isInitialized()) {
                this.afterDrainPlaybackParameters = playbackParameters;
            } else {
                this.playbackParameters = this.audioProcessorChain.applyPlaybackParameters(playbackParameters);
            }
        }
        return this.playbackParameters;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.audio.AudioSink
    public void setVolume(float f10) {
        if (this.volume != f10) {
            this.volume = f10;
            setVolumeInternal();
        }
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr, boolean z10) {
        this(audioCapabilities, new DefaultAudioProcessorChain(audioProcessorArr), z10);
    }

    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean z10) {
        this.audioCapabilities = audioCapabilities;
        this.audioProcessorChain = (AudioProcessorChain) Assertions.checkNotNull(audioProcessorChain);
        this.enableConvertHighResIntPcmToFloat = z10;
        this.releasingConditionVariable = new ConditionVariable(true);
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener());
        ChannelMappingAudioProcessor channelMappingAudioProcessor = new ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        TrimmingAudioProcessor trimmingAudioProcessor = new TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ResamplingAudioProcessor(), channelMappingAudioProcessor, trimmingAudioProcessor);
        Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[arrayList.size()]);
        this.toFloatPcmAvailableAudioProcessors = new AudioProcessor[]{new FloatResamplingAudioProcessor()};
        this.volume = 1.0f;
        this.startMediaTimeState = 0;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.playbackParameters = PlaybackParameters.DEFAULT;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new AudioProcessor[0];
        this.outputBuffers = new ByteBuffer[0];
        this.playbackParametersCheckpoints = new ArrayDeque<>();
    }
}
