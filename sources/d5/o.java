package d5;

import android.content.Context;
import android.opengl.GLES20;
import android.util.Log;
import android.view.KeyCharacterMap;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.a02;
import com.google.android.gms.internal.ads.jf;
import com.google.android.gms.internal.ads.li0;
import com.google.android.gms.internal.ads.zb0;
import com.google.android.gms.internal.ads.zz1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements zb0, li0, t9.b, mk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f38701c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38703b;

    public /* synthetic */ o(int i10, int i11) {
        this.f38702a = i11;
        this.f38703b = i10;
    }

    public static synchronized o g() {
        try {
            if (f38701c == null) {
                f38701c = new o(3, 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38701c;
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // t9.b
    public int a(Context context, String str, boolean z10) {
        return 0;
    }

    public Character b(int i10) {
        char c4 = (char) i10;
        if ((Integer.MIN_VALUE & i10) != 0) {
            int i11 = i10 & Integer.MAX_VALUE;
            int i12 = this.f38703b;
            if (i12 != 0) {
                this.f38703b = KeyCharacterMap.getDeadChar(i12, i11);
            } else {
                this.f38703b = i11;
            }
        } else {
            int i13 = this.f38703b;
            if (i13 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i13, i10);
                if (deadChar > 0) {
                    c4 = (char) deadChar;
                }
                this.f38703b = 0;
            }
        }
        return Character.valueOf(c4);
    }

    public void c() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f38703b);
        nf.a.b("bind");
    }

    @Override // t9.b
    public int d(Context context, String str) {
        return this.f38703b;
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f38703b <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.f38703b <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    @Override // mk.a
    public Object getValue(Object obj, qk.w property) {
        vm.d thisRef = (vm.d) obj;
        kotlin.jvm.internal.n.f(thisRef, "thisRef");
        kotlin.jvm.internal.n.f(property, "property");
        return thisRef.f52661a.get(this.f38703b);
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.f38703b <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void j() {
        GLES20.glBindTexture(36197, 0);
        GLES20.glActiveTexture(33984);
        nf.a.b("unbind");
    }

    public void k(String str, String str2, Throwable... thArr) {
        if (this.f38703b <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public int l() {
        int i10 = this.f38703b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo160zza(Object obj) {
        switch (this.f38702a) {
            case 3:
                ((zzr) obj).zzdU(this.f38703b);
                break;
            case 7:
                ((a02) obj).h(this.f38703b);
                break;
            case 8:
                ((a02) obj).a(this.f38703b);
                break;
            default:
                ((a02) obj).g(this.f38703b);
                break;
        }
    }

    public /* synthetic */ o(int i10, int i11, Object obj) {
        this.f38702a = i11;
        this.f38703b = i10;
    }

    public /* synthetic */ o(zz1 zz1Var, int i10, long j10) {
        this.f38702a = 7;
        this.f38703b = i10;
    }

    public /* synthetic */ o(zz1 zz1Var, int i10, jf jfVar, jf jfVar2) {
        this.f38702a = 9;
        this.f38703b = i10;
    }

    public /* synthetic */ o(o oVar) {
        this.f38702a = 5;
        this.f38703b = oVar.f38703b;
    }

    public o(int i10, String str) {
        this.f38702a = 16;
        int iGlCreateShader = GLES20.glCreateShader(i10);
        nf.a.b("glCreateShader type=" + Integer.valueOf(i10));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            this.f38703b = iGlCreateShader;
            return;
        }
        StringBuilder sbU = defpackage.e.u(i10, "Could not compile shader ", ": '");
        sbU.append((Object) GLES20.glGetShaderInfoLog(iGlCreateShader));
        sbU.append("' source: ");
        sbU.append(str);
        String string = sbU.toString();
        GLES20.glDeleteShader(iGlCreateShader);
        throw new RuntimeException(string);
    }

    public o(int i10) {
        this.f38702a = i10;
        switch (i10) {
            case 17:
                int[] iArr = {iArr[0]};
                GLES20.glGenTextures(1, iArr, 0);
                int[] iArr2 = {iArr[0]};
                nf.a.b("glGenTextures");
                this.f38703b = iArr2[0];
                sf.a aVar = new sf.a(0);
                c();
                aVar.invoke();
                j();
                break;
            default:
                this.f38703b = 0;
                break;
        }
    }
}
