package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f17617b;

    public n12(Context context) {
        this.f17616a = context == null ? null : context.getApplicationContext();
    }

    public final p02 a(z80 z80Var, g22 g22Var) {
        boolean zBooleanValue;
        int i10;
        g22Var.getClass();
        z80Var.getClass();
        int i11 = Build.VERSION.SDK_INT;
        int i12 = g22Var.I;
        if (i12 == -1) {
            return p02.f18420d;
        }
        Boolean bool = this.f17617b;
        boolean z10 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.f17616a;
            if (context != null) {
                String parameters = x10.b(context).getParameters("offloadVariableRateSupported");
                this.f17617b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f17617b = Boolean.FALSE;
            }
            zBooleanValue = this.f17617b.booleanValue();
        }
        String str = g22Var.f14678o;
        str.getClass();
        int iF = na.f(str, g22Var.f14675k);
        if (iF != 0) {
            switch (iF) {
                case 2:
                case 3:
                    i10 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i10 = 21;
                    break;
                case 7:
                case 8:
                    i10 = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i10 = 28;
                    break;
                case 13:
                case 19:
                case 23:
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                default:
                    i10 = Integer.MAX_VALUE;
                    break;
                case 14:
                    i10 = 25;
                    break;
                case 20:
                    i10 = 30;
                    break;
                case 21:
                case 22:
                    i10 = 31;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                case 31:
                    i10 = 34;
                    break;
            }
            if (i11 >= i10) {
                int iE = g22Var.H;
                if (iE == -1) {
                    iE = uu0.e(g22Var.G);
                }
                if (iE == 0) {
                    return p02.f18420d;
                }
                try {
                    AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i12).setChannelMask(iE).setEncoding(iF).build();
                    if (i11 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, z80Var.a());
                        if ((directPlaybackSupport & 1) == 0) {
                            return p02.f18420d;
                        }
                        z10 = (directPlaybackSupport & 3) == 3;
                        f6 f6Var = new f6();
                        f6Var.f14258a = true;
                        f6Var.f14259b = z10;
                        f6Var.f14260c = zBooleanValue;
                        return f6Var.c();
                    }
                    if (i11 < 31) {
                        if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, z80Var.a())) {
                            return p02.f18420d;
                        }
                        f6 f6Var2 = new f6();
                        f6Var2.f14258a = true;
                        f6Var2.f14260c = zBooleanValue;
                        return f6Var2.c();
                    }
                    int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, z80Var.a());
                    if (playbackOffloadSupport == 0) {
                        return p02.f18420d;
                    }
                    f6 f6Var3 = new f6();
                    if (i11 > 32 && playbackOffloadSupport == 2) {
                        z10 = true;
                    }
                    f6Var3.f14258a = true;
                    f6Var3.f14259b = z10;
                    f6Var3.f14260c = zBooleanValue;
                    return f6Var3.c();
                } catch (IllegalArgumentException unused) {
                    return p02.f18420d;
                }
            }
        }
        return p02.f18420d;
    }
}
