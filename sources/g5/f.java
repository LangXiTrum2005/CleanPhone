package g5;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d5.o;
import g9.k;
import n5.j;
import n5.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f41538b;

    public /* synthetic */ f(h hVar, int i10) {
        this.f41537a = i10;
        this.f41538b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005e, B:20:0x0068, B:22:0x0070, B:23:0x0072, B:27:0x007c, B:29:0x008b, B:37:0x009d, B:33:0x0091, B:34:0x0092, B:36:0x009a, B:41:0x00a1, B:24:0x0073, B:25:0x0079, B:17:0x005f, B:18:0x0065), top: B:66:0x001b, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005e, B:20:0x0068, B:22:0x0070, B:23:0x0072, B:27:0x007c, B:29:0x008b, B:37:0x009d, B:33:0x0091, B:34:0x0092, B:36:0x009a, B:41:0x00a1, B:24:0x0073, B:25:0x0079, B:17:0x005f, B:18:0x0065), top: B:66:0x001b, inners: #4, #5 }] */
    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        f fVar;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.f41537a) {
            case 0:
                synchronized (this.f41538b.f41551h) {
                    h hVar2 = this.f41538b;
                    hVar2.f41552i = (Intent) hVar2.f41551h.get(0);
                    break;
                }
                Intent intent = this.f41538b.f41552i;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f41538b.f41552i.getIntExtra("KEY_START_ID", 0);
                    o oVarG = o.g();
                    String str = h.f41543k;
                    oVarG.e(str, String.format("Processing command %s, %s", this.f41538b.f41552i, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock wakeLockA = l.a(this.f41538b.f41544a, action + " (" + intExtra + ")");
                    try {
                        o.g().e(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.acquire();
                        h hVar3 = this.f41538b;
                        hVar3.f41549f.c(hVar3.f41552i, intExtra, hVar3);
                        o.g().e(str, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                        wakeLockA.release();
                        hVar = this.f41538b;
                        fVar = new f(hVar, 1);
                    } catch (Throwable th2) {
                        try {
                            o oVarG2 = o.g();
                            String str2 = h.f41543k;
                            oVarG2.f(str2, "Unexpected error in onHandleIntent", th2);
                            o.g().e(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            hVar = this.f41538b;
                            fVar = new f(hVar, 1);
                        } catch (Throwable th3) {
                            o.g().e(h.f41543k, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                            wakeLockA.release();
                            h hVar4 = this.f41538b;
                            hVar4.d(new f(hVar4, 1));
                            throw th3;
                        }
                    }
                    hVar.d(fVar);
                    return;
                }
                return;
            default:
                h hVar5 = this.f41538b;
                o oVarG3 = o.g();
                String str3 = h.f41543k;
                oVarG3.e(str3, "Checking if commands are complete.", new Throwable[0]);
                hVar5.b();
                synchronized (hVar5.f41551h) {
                    try {
                        if (hVar5.f41552i != null) {
                            o.g().e(str3, String.format("Removing command %s", hVar5.f41552i), new Throwable[0]);
                            if (!((Intent) hVar5.f41551h.remove(0)).equals(hVar5.f41552i)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar5.f41552i = null;
                        }
                        j jVar = (j) ((k) hVar5.f41545b).f41770b;
                        b bVar = hVar5.f41549f;
                        synchronized (bVar.f41522c) {
                            zIsEmpty = bVar.f41521b.isEmpty();
                            break;
                        }
                        if (zIsEmpty && hVar5.f41551h.isEmpty()) {
                            synchronized (jVar.f46531c) {
                                zIsEmpty2 = jVar.f46529a.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                o.g().e(str3, "No more commands & intents.", new Throwable[0]);
                                SystemAlarmService systemAlarmService = hVar5.f41553j;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            } else if (!hVar5.f41551h.isEmpty()) {
                                hVar5.f();
                            }
                        } else if (!hVar5.f41551h.isEmpty()) {
                            hVar5.f();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
