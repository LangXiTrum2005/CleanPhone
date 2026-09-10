package com.google.android.gms.internal.ads;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements h81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f12948b;

    public /* synthetic */ c(m mVar, h hVar) {
        this.f12947a = mVar;
        this.f12948b = hVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.h81
    public final boolean zza(Object obj) {
        int i10;
        j0 j0Var;
        j0 j0Var2;
        g22 g22Var = (g22) obj;
        if (!this.f12948b.A) {
            return true;
        }
        m mVar = this.f12947a;
        Boolean bool = mVar.f17179i;
        if ((bool != null && bool.booleanValue()) || (i10 = g22Var.G) == -1 || i10 <= 2) {
            return true;
        }
        String str = g22Var.f14678o;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                        if (Build.VERSION.SDK_INT >= 32 || (j0Var2 = mVar.f17177g) == null || !j0Var2.f15886b) {
                            return true;
                        }
                    }
                    break;
                case 187078296:
                    if (str.equals(MimeTypes.AUDIO_AC3)) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            return true;
                        }
                        return true;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            return true;
                        }
                        return true;
                    }
                    break;
                case 1504578661:
                    if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            return true;
                        }
                        return true;
                    }
                    break;
            }
        }
        return Build.VERSION.SDK_INT >= 32 && (j0Var = mVar.f17177g) != null && j0Var.f15886b && j0Var.a() && mVar.f17177g.b() && mVar.f17177g.c(mVar.f17178h, g22Var);
    }
}
