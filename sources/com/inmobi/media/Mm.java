package com.inmobi.media;

import android.media.MediaPlayer;
import androidx.media3.exoplayer.adultoid;
import androidx.media3.exoplayer.source.formularize;
import com.inmobi.media.Mm;
import igo.attabal;
import igo.beachfront;
import java.io.IOException;
import kotlinx.coroutines.kowloon;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Mm {
    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:15:0x0043->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:25:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(android.media.MediaPlayer r7, java.util.ArrayList r8, com.inmobi.media.C3097n9 r9, p002kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.Fm
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.Fm r0 = (com.inmobi.media.Fm) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.inmobi.media.Fm r0 = new com.inmobi.media.Fm
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            java.lang.Object r1 = p002kotlin.coroutines.intrinsics.attabal.beachfront()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.d
            java.util.Iterator r8 = r0.c
            com.inmobi.media.m9 r9 = r0.b
            android.media.MediaPlayer r2 = r0.a
            p002kotlin.dern.saneness(r10)
            goto L88
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            p002kotlin.dern.saneness(r10)
            a(r7, r9)
            java.util.Iterator r8 = r8.iterator()
        L43:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L98
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r10)
            if (r2 == 0) goto L43
            if (r9 == 0) goto L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Video Loading for URL: "
            r2.append(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r4 = r9
            com.inmobi.media.n9 r4 = (com.inmobi.media.C3097n9) r4
            java.lang.String r5 = "VideoLoaderHelper"
            r4.a(r5, r2)
        L70:
            r7.reset()
            r0.a = r7
            r0.b = r9
            r0.c = r8
            r0.d = r10
            r0.f = r3
            java.lang.Object r2 = a(r7, r10, r9, r0)
            if (r2 != r1) goto L84
            return r1
        L84:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L88:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            com.inmobi.media.Dm r8 = new com.inmobi.media.Dm
            r8.<init>(r7)
            return r8
        L96:
            r7 = r2
            goto L43
        L98:
            com.inmobi.media.zm r7 = com.inmobi.media.C3409zm.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mm.a(android.media.MediaPlayer, java.util.ArrayList, com.inmobi.media.n9, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void a(MediaPlayer mediaPlayer, final C3097n9 c3097n9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: adsuki.ctenidium
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i) {
                Mm.a(c3097n9, mediaPlayer2, i);
            }
        });
    }

    public static final void a(InterfaceC3072m9 interfaceC3072m9, MediaPlayer mediaPlayer, int i) {
        if (interfaceC3072m9 != null) {
            ((C3097n9) interfaceC3072m9).a("VideoLoaderHelper", "Buffering Percentage: " + i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x011a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0141 -> B:58:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.media3.exoplayer.adultoid r14, java.util.ArrayList r15, com.inmobi.media.InterfaceC3072m9 r16, com.inmobi.media.K2 r17, boolean r18, p002kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Mm.a(androidx.media3.exoplayer.adultoid, java.util.ArrayList, com.inmobi.media.m9, com.inmobi.media.K2, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object a(MediaPlayer mediaPlayer, String str, InterfaceC3072m9 interfaceC3072m9, Fm fm) {
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(fm), 1);
        kowloonVar.kattegat();
        kowloonVar.beachfront(new Hm(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new Im(interfaceC3072m9, str, kowloonVar));
            mediaPlayer.setOnErrorListener(new Jm(interfaceC3072m9, str, kowloonVar));
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepareAsync();
        } catch (IOException e) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("VideoLoaderHelper", "Video Load Exception: " + e.getMessage());
            }
            P4.a(kowloonVar, attabal.attabal(false));
        } catch (IllegalStateException e2) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("VideoLoaderHelper", "Video Load Exception: " + e2.getMessage());
            }
            P4.a(kowloonVar, attabal.attabal(false));
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(fm);
        }
        return objCuirassed;
    }

    public static final Object a(adultoid adultoidVar, String str, InterfaceC3072m9 interfaceC3072m9, K2 k2, boolean z, Gm gm) {
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(gm), 1);
        kowloonVar.kattegat();
        Lm lm = new Lm(kowloonVar, k2, str, interfaceC3072m9, adultoidVar);
        kowloonVar.beachfront(new Km(adultoidVar, lm));
        if (interfaceC3072m9 != null) {
            try {
                ((C3097n9) interfaceC3072m9).a("VideoLoaderHelper", "Trying URL with cache " + z + ": " + str);
            } catch (Exception e) {
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).b("VideoLoaderHelper", "Exception during media source preparation for URL (" + str + "): " + e.getMessage());
                }
                adultoidVar.impromptu(lm);
                if (kowloonVar.isActive()) {
                    P4.a(kowloonVar, new C2819c8(Am.UNKNOWN));
                }
                adultoidVar.stop();
                adultoidVar.dern();
            }
        }
        formularize formularizeVarA = k2.a(str, z);
        adultoidVar.cutely(lm);
        adultoidVar.kowloon(formularizeVarA);
        adultoidVar.attabal();
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(gm);
        }
        return objCuirassed;
    }
}
