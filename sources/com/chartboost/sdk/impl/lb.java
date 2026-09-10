package com.chartboost.sdk.impl;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.chartboost.sdk.events.ChartboostError;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lb {

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f14414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f14415c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f14416e;
        public /* synthetic */ Object f;
        public int g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.g |= Integer.MIN_VALUE;
            return lb.b((URL) null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0125 A[Catch: Exception -> 0x0218, TRY_ENTER, TryCatch #4 {Exception -> 0x0218, blocks: (B:33:0x00f0, B:40:0x0125, B:43:0x012a, B:47:0x014b), top: B:101:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0129  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b A[Catch: Exception -> 0x0218, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0218, blocks: (B:33:0x00f0, B:40:0x0125, B:43:0x012a, B:47:0x014b), top: B:101:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0151 A[Catch: Exception -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x011f, blocks: (B:35:0x00f4, B:45:0x012e, B:49:0x0151), top: B:95:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0177 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:52:0x016d, B:54:0x0177, B:57:0x0183, B:59:0x01b8, B:63:0x01ed), top: B:94:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0183 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:52:0x016d, B:54:0x0177, B:57:0x0183, B:59:0x01b8, B:63:0x01ed), top: B:94:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b8 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:52:0x016d, B:54:0x0177, B:57:0x0183, B:59:0x01b8, B:63:0x01ed), top: B:94:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ed A[Catch: Exception -> 0x0180, TRY_LEAVE, TryCatch #0 {Exception -> 0x0180, blocks: (B:52:0x016d, B:54:0x0177, B:57:0x0183, B:59:0x01b8, B:63:0x01ed), top: B:94:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.chartboost.sdk.impl.l6] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.chartboost.sdk.impl.l6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.chartboost.sdk.impl.lb$a] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.net.URL] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.chartboost.sdk.impl.lb$a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.chartboost.sdk.impl.lb$a, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ea -> B:101:0x00f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(java.net.URL r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.lb.b(java.net.URL, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(URL url, Continuation continuation) {
        return b(url, continuation);
    }

    public static final Integer a(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Integer.valueOf(mediaFormat.getInteger(str));
            }
            return null;
        } catch (Exception e2) {
            za.d("Failed to get integer value for key " + str, e2);
            return null;
        }
    }

    public static final List a(String str) {
        ChartboostError unsupportedCodec;
        EmptyList emptyList = EmptyList.X;
        try {
            File file = new File(str);
            if (!file.exists()) {
                za.e("File does not exist: " + str, null, 2, null);
                return emptyList;
            }
            if (!file.canRead()) {
                za.e("Cannot read file: " + str, null, 2, null);
                return emptyList;
            }
            za.a("Attempting to extract codecs from: " + str + " (" + file.length() + " bytes)", (Throwable) null, 2, (Object) null);
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                za.a("MediaExtractor found " + trackCount + " tracks", (Throwable) null, 2, (Object) null);
                if (trackCount == 0) {
                    za.e("No tracks found in media file", null, 2, null);
                    mediaExtractor.release();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < trackCount; i2++) {
                    try {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                        Intrinsics.e(trackFormat, "getTrackFormat(...)");
                        String string = trackFormat.getString("mime");
                        if (string != null) {
                            arrayList.add(string);
                            za.d("Track " + i2 + ": Found codec: " + string, null, 2, null);
                            za.d("  Duration: " + b(trackFormat, "durationUs") + ", Bitrate: " + a(trackFormat, "bitrate"), null, 2, null);
                        } else {
                            za.d("Track " + i2 + ": No MIME type found", null, 2, null);
                        }
                    } catch (Exception e2) {
                        ChartboostError.Load.UnsupportedCodec unsupportedCodec2 = new ChartboostError.Load.UnsupportedCodec("Failed to extract codec info for track " + i2 + ": " + e2.getMessage(), e2);
                        za.e(com.ironsource.d9.i.d + unsupportedCodec2.getCode() + "] Failed to get format for track " + i2, unsupportedCodec2);
                    }
                }
                mediaExtractor.release();
                return arrayList;
            } catch (Throwable th) {
                mediaExtractor.release();
                throw th;
            }
        } catch (Exception e3) {
            if (e3 instanceof IOException) {
                unsupportedCodec = new ChartboostError.Load.AssetUnavailable(str, android.support.v4.media.a.C("Failed to read media file: ", e3.getMessage()), e3);
            } else if (e3 instanceof IllegalArgumentException) {
                unsupportedCodec = new ChartboostError.Load.InvalidAssetUrl(str, android.support.v4.media.a.C("Invalid media file path: ", e3.getMessage()), e3);
            } else {
                unsupportedCodec = new ChartboostError.Load.UnsupportedCodec(android.support.v4.media.a.C("Failed to extract codecs from media file: ", e3.getMessage()), e3);
            }
            za.e(com.ironsource.d9.i.d + unsupportedCodec.getCode() + "] Failed to extract codecs from " + str, unsupportedCodec);
            return emptyList;
        }
    }

    public static final Long b(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Long.valueOf(mediaFormat.getLong(str));
            }
            return null;
        } catch (Exception e2) {
            za.d("Failed to get long value for key " + str, e2);
            return null;
        }
    }
}
