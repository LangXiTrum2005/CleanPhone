package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 implements q7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m7 f19456e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np0 f19457a = new np0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f19458b = new np0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q8 f19459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Inflater f19460d;

    static {
        aa1 aa1Var = ca1.f13122b;
        f19456e = new m7(ya1.f22208e, C.TIME_UNSET, C.TIME_UNSET);
    }

    public r8(List list) {
        int i10;
        q8 q8Var = new q8();
        this.f19459c = q8Var;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = uu0.f20901a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                q8Var.f18973f = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int[] iArr = q8Var.f18973f;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                    } catch (RuntimeException e10) {
                        v71.B("VobsubParser", "Parsing color failed", e10);
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    StringBuilder sb2 = new StringBuilder(str2.length() + 36);
                    sb2.append("Ignoring malformed IDX size line: '");
                    sb2.append(str2);
                    sb2.append("'");
                    v71.y("VobsubParser", sb2.toString());
                } else {
                    try {
                        q8Var.f18974g = Integer.parseInt(strArrSplit2[0]);
                        q8Var.f18975h = Integer.parseInt(strArrSplit2[1]);
                        q8Var.f18971d = true;
                    } catch (RuntimeException e11) {
                        v71.B("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.q7
    public final void b(int r26, int r27, b2.d0 r28, byte[] r29) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r8.b(int, int, b2.d0, byte[]):void");
    }
}
