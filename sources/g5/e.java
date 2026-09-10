package g5;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d5.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m5.i;
import n5.l;
import n5.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i5.b, e5.a, q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f41527j = o.i("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f41531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i5.c f41532e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f41535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41536i = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41534g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f41533f = new Object();

    public e(Context context, int i10, String str, h hVar) {
        this.f41528a = context;
        this.f41529b = i10;
        this.f41531d = hVar;
        this.f41530c = str;
        this.f41532e = new i5.c(context, hVar.f41545b, this);
    }

    public final void a() {
        synchronized (this.f41533f) {
            try {
                this.f41532e.c();
                this.f41531d.f41546c.b(this.f41530c);
                PowerManager.WakeLock wakeLock = this.f41535h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.g().e(f41527j, "Releasing wakelock " + this.f41535h + " for WorkSpec " + this.f41530c, new Throwable[0]);
                    this.f41535h.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f41530c;
        sb2.append(str);
        sb2.append(" (");
        sb2.append(this.f41529b);
        sb2.append(")");
        this.f41535h = l.a(this.f41528a, sb2.toString());
        o oVarG = o.g();
        PowerManager.WakeLock wakeLock = this.f41535h;
        String str2 = f41527j;
        oVarG.e(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f41535h.acquire();
        i iVarL = this.f41531d.f41548e.f39111c.n().l(str);
        if (iVarL == null) {
            d();
            return;
        }
        boolean zB = iVarL.b();
        this.f41536i = zB;
        if (zB) {
            this.f41532e.b(Collections.singletonList(iVarL));
        } else {
            o.g().e(str2, defpackage.e.n("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // i5.b
    public final void c(ArrayList arrayList) {
        d();
    }

    public final void d() {
        synchronized (this.f41533f) {
            try {
                if (this.f41534g < 2) {
                    this.f41534g = 2;
                    o oVarG = o.g();
                    String str = f41527j;
                    oVarG.e(str, "Stopping work for WorkSpec " + this.f41530c, new Throwable[0]);
                    Context context = this.f41528a;
                    String str2 = this.f41530c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    h hVar = this.f41531d;
                    hVar.d(new g(this.f41529b, 0, hVar, intent));
                    if (this.f41531d.f41547d.c(this.f41530c)) {
                        o.g().e(str, "WorkSpec " + this.f41530c + " needs to be rescheduled", new Throwable[0]);
                        Intent intentB = b.b(this.f41528a, this.f41530c);
                        h hVar2 = this.f41531d;
                        hVar2.d(new g(this.f41529b, 0, hVar2, intentB));
                    } else {
                        o.g().e(str, "Processor does not have WorkSpec " + this.f41530c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    o.g().e(f41527j, "Already stopped work for " + this.f41530c, new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e5.a
    public final void e(String str, boolean z10) {
        o.g().e(f41527j, "onExecuted " + str + ", " + z10, new Throwable[0]);
        a();
        int i10 = this.f41529b;
        h hVar = this.f41531d;
        Context context = this.f41528a;
        if (z10) {
            hVar.d(new g(i10, 0, hVar, b.b(context, this.f41530c)));
        }
        if (this.f41536i) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.d(new g(i10, 0, hVar, intent));
        }
    }

    @Override // i5.b
    public final void f(List list) {
        if (list.contains(this.f41530c)) {
            synchronized (this.f41533f) {
                try {
                    if (this.f41534g == 0) {
                        this.f41534g = 1;
                        o.g().e(f41527j, "onAllConstraintsMet for " + this.f41530c, new Throwable[0]);
                        if (this.f41531d.f41547d.g(this.f41530c, null)) {
                            this.f41531d.f41546c.a(this.f41530c, this);
                        } else {
                            a();
                        }
                    } else {
                        o.g().e(f41527j, "Already started work for " + this.f41530c, new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
