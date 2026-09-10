package ea;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.ts;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39716a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f39720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f39721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f39722g;

    public q0(s0 s0Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f39717b = i10;
        this.f39718c = str;
        this.f39719d = obj;
        this.f39720e = obj2;
        this.f39721f = obj3;
        this.f39722g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39716a) {
            case 0:
                s0 s0Var = (s0) this.f39722g;
                a1 a1Var = ((m1) s0Var.f3623a).f39586e;
                m1.f(a1Var);
                if (!a1Var.f39766b) {
                    Log.println(6, s0Var.Q0(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (s0Var.f39750c == 0) {
                    g gVar = ((m1) s0Var.f3623a).f39585d;
                    if (gVar.f39418e == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f39418e == null) {
                                    m1 m1Var = (m1) gVar.f3623a;
                                    ApplicationInfo applicationInfo = m1Var.f39582a.getApplicationInfo();
                                    if (p9.c.f48287i == null) {
                                        p9.c.f48287i = Application.getProcessName();
                                    }
                                    String str = p9.c.f48287i;
                                    if (applicationInfo != null) {
                                        String str2 = applicationInfo.processName;
                                        gVar.f39418e = Boolean.valueOf(str2 != null && str2.equals(str));
                                    }
                                    if (gVar.f39418e == null) {
                                        gVar.f39418e = Boolean.TRUE;
                                        s0 s0Var2 = m1Var.f39587f;
                                        m1.h(s0Var2);
                                        s0Var2.f39753f.b("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    if (gVar.f39418e.booleanValue()) {
                        s0Var.f39750c = 'C';
                    } else {
                        s0Var.f39750c = 'c';
                    }
                    break;
                }
                if (s0Var.f39751d < 0) {
                    ((m1) s0Var.f3623a).f39585d.M0();
                    s0Var.f39751d = 161000L;
                }
                int i10 = this.f39717b;
                char c4 = s0Var.f39750c;
                long j10 = s0Var.f39751d;
                String str3 = this.f39718c;
                Object obj = this.f39719d;
                Object obj2 = this.f39720e;
                Object obj3 = this.f39721f;
                char cCharAt = "01VDIWEA?".charAt(i10);
                String strR0 = s0.R0(true, str3, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(l1.d.r(String.valueOf(cCharAt).length() + 1, String.valueOf(c4).length(), String.valueOf(j10).length(), 1) + strR0.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c4);
                sb2.append(j10);
                sb2.append(":");
                sb2.append(strR0);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str3.substring(0, 1024);
                }
                ts tsVar = a1Var.f39206e;
                if (tsVar != null) {
                    String str4 = (String) tsVar.f20477d;
                    a1 a1Var2 = (a1) tsVar.f20478e;
                    a1Var2.G0();
                    if (((a1) tsVar.f20478e).K0().getLong((String) tsVar.f20475b, 0L) == 0) {
                        tsVar.c();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesK0 = a1Var2.K0();
                    String str5 = (String) tsVar.f20476c;
                    long j11 = sharedPreferencesK0.getLong(str5, 0L);
                    if (j11 <= 0) {
                        SharedPreferences.Editor editorEdit = a1Var2.K0().edit();
                        editorEdit.putString(str4, string);
                        editorEdit.putLong(str5, 1L);
                        editorEdit.apply();
                        return;
                    }
                    l4 l4Var = ((m1) a1Var2.f3623a).f39590i;
                    m1.f(l4Var);
                    long jNextLong = l4Var.E1().nextLong() & Long.MAX_VALUE;
                    long j12 = j11 + 1;
                    long j13 = Long.MAX_VALUE / j12;
                    SharedPreferences.Editor editorEdit2 = a1Var2.K0().edit();
                    if (jNextLong < j13) {
                        editorEdit2.putString(str4, string);
                    }
                    editorEdit2.putLong(str5, j12);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((t0) this.f39719d).b(this.f39718c, this.f39717b, (Throwable) this.f39720e, (byte[]) this.f39721f, (Map) this.f39722g);
                return;
        }
    }

    public /* synthetic */ q0(String str, t0 t0Var, int i10, IOException iOException, byte[] bArr, Map map) {
        k9.c0.h(t0Var);
        this.f39719d = t0Var;
        this.f39717b = i10;
        this.f39720e = iOException;
        this.f39721f = bArr;
        this.f39718c = str;
        this.f39722g = map;
    }
}
