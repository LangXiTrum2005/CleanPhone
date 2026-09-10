package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class graveside implements deadwork {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f11883attabal;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f11885competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f11887impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f11888marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.dern f11889saneness;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f11886dern = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f11890wireman = 5000;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.media3.exoplayer.mediacodec.competently f11884beachfront = androidx.media3.exoplayer.mediacodec.competently.f12072attabal;

    public graveside(Context context) {
        this.f11883attabal = context;
        this.f11889saneness = new androidx.media3.exoplayer.mediacodec.dern(context);
    }

    @Override // androidx.media3.exoplayer.deadwork
    public homozygous[] attabal(Handler handler, androidx.media3.exoplayer.video.marial marialVar, androidx.media3.exoplayer.audio.dern dernVar, microanalysis.impromptu impromptuVar, tout.saneness sanenessVar) {
        Handler handler2;
        ArrayList<homozygous> arrayList = new ArrayList<>();
        taiyuan(this.f11883attabal, this.f11886dern, this.f11884beachfront, this.f11888marial, handler, marialVar, this.f11890wireman, arrayList);
        AudioSink audioSinkDern = dern(this.f11883attabal, this.f11885competently, this.f11887impromptu);
        if (audioSinkDern != null) {
            handler2 = handler;
            saneness(this.f11883attabal, this.f11886dern, this.f11884beachfront, this.f11888marial, audioSinkDern, handler2, dernVar, arrayList);
        } else {
            handler2 = handler;
        }
        impromptu(this.f11883attabal, impromptuVar, handler2.getLooper(), this.f11886dern, arrayList);
        beachfront(this.f11883attabal, sanenessVar, handler2.getLooper(), this.f11886dern, arrayList);
        wireman(this.f11883attabal, this.f11886dern, arrayList);
        marial(arrayList);
        competently(this.f11883attabal, handler2, this.f11886dern, arrayList);
        return (homozygous[]) arrayList.toArray(new homozygous[0]);
    }

    public void beachfront(Context context, tout.saneness sanenessVar, Looper looper, int i, ArrayList<homozygous> arrayList) {
        arrayList.add(new tout.dern(sanenessVar, looper));
    }

    public androidx.media3.exoplayer.mediacodec.wireman.saneness cutely() {
        return this.f11889saneness;
    }

    public AudioSink dern(Context context, boolean z, boolean z2) {
        return new DefaultAudioSink.beachfront(context).apical(z).cutely(z2).taiyuan();
    }

    public void impromptu(Context context, microanalysis.impromptu impromptuVar, Looper looper, int i, ArrayList<homozygous> arrayList) {
        arrayList.add(new microanalysis.taiyuan(impromptuVar, looper));
    }

    public void marial(ArrayList<homozygous> arrayList) {
        arrayList.add(new ctenidium.beachfront(ctenidium.dern.attabal.f24240attabal, null));
    }

    public void saneness(Context context, int i, androidx.media3.exoplayer.mediacodec.competently competentlyVar, boolean z, AudioSink audioSink, Handler handler, androidx.media3.exoplayer.audio.dern dernVar, ArrayList<homozygous> arrayList) {
        int i2;
        int i3;
        int i4;
        arrayList.add(new androidx.media3.exoplayer.audio.competently(context, cutely(), competentlyVar, z, handler, dernVar, audioSink));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (homozygous) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    decarock.triweekly.beachfront("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating MIDI extension", e);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (homozygous) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.dern.class, AudioSink.class).newInstance(handler, dernVar, audioSink));
                    decarock.triweekly.beachfront("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i2 = i3;
                    i3 = i2;
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating Opus extension", e2);
            }
        } catch (ClassNotFoundException unused4) {
        }
        try {
            try {
                i4 = i3 + 1;
                try {
                    arrayList.add(i3, (homozygous) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.dern.class, AudioSink.class).newInstance(handler, dernVar, audioSink));
                    decarock.triweekly.beachfront("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                    i3 = i4;
                    i4 = i3;
                }
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FLAC extension", e3);
            }
        } catch (ClassNotFoundException unused6) {
        }
        try {
            arrayList.add(i4, (homozygous) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, androidx.media3.exoplayer.audio.dern.class, AudioSink.class).newInstance(handler, dernVar, audioSink));
            decarock.triweekly.beachfront("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused7) {
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e4);
        }
    }

    public void taiyuan(Context context, int i, androidx.media3.exoplayer.mediacodec.competently competentlyVar, boolean z, Handler handler, androidx.media3.exoplayer.video.marial marialVar, long j, ArrayList<homozygous> arrayList) {
        String str;
        Integer num;
        int i2;
        int i3;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new androidx.media3.exoplayer.video.saneness(context, cutely(), competentlyVar, j, z, handler, marialVar, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.marial.class, cls);
                num = 50;
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (homozygous) constructor.newInstance(Long.valueOf(j), handler, marialVar, 50));
                        str = "DefaultRenderersFactory";
                        try {
                            decarock.triweekly.beachfront(str, "Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                }
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused4) {
            str = "DefaultRenderersFactory";
            num = 50;
        }
        try {
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (homozygous) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.marial.class, cls).newInstance(Long.valueOf(j), handler, marialVar, num));
                    decarock.triweekly.beachfront(str, "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                    i2 = i3;
                    i3 = i2;
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        } catch (ClassNotFoundException unused6) {
        }
        try {
            arrayList.add(i3, (homozygous) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, androidx.media3.exoplayer.video.marial.class, cls).newInstance(Long.valueOf(j), handler, marialVar, num));
            decarock.triweekly.beachfront(str, "Loaded FfmpegVideoRenderer.");
        } catch (ClassNotFoundException unused7) {
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e3);
        }
    }

    public void wireman(Context context, int i, ArrayList<homozygous> arrayList) {
        arrayList.add(new harlequinade.saneness());
    }

    public void competently(Context context, Handler handler, int i, ArrayList<homozygous> arrayList) {
    }
}
