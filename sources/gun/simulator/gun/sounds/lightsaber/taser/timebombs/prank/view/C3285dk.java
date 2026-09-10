package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Point;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3285dk implements CallbackToFutureAdapter.Resolver, Ka0, BI, CI, Cdo, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4286a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3285dk(int i, Object obj, Object obj2) {
        this.f4286a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void c(Task task) {
        RY ry = (RY) this.b;
        String str = (String) this.c;
        synchronized (ry) {
            ry.b.remove(str);
        }
    }

    private final void d(Task task) {
        C2881Xh c2881Xh = (C2881Xh) this.b;
        Date date = (Date) this.c;
        int[] iArr = C2881Xh.k;
        c2881Xh.getClass();
        if (task.isSuccessful()) {
            C3633hi c3633hi = c2881Xh.h;
            synchronized (c3633hi.b) {
                c3633hi.f4465a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof C2453Gu) {
            c2881Xh.h.g();
        } else {
            c2881Xh.h.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cdo
    public final C3965lY a(int i, C3974ld0 c3974ld0, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f4286a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 13:
                C2939Zn c2939Zn = (C2939Zn) obj2;
                AbstractC2992aT abstractC2992aT = C3557go.j;
                int i8 = ((int[]) obj)[i];
                int i9 = c2939Zn.i;
                if (i9 == Integer.MAX_VALUE || (i3 = c2939Zn.j) == Integer.MAX_VALUE) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < c3974ld0.f4655a; i11++) {
                        C4619sw c4619sw = c3974ld0.d[i11];
                        int i12 = c4619sw.q;
                        if (i12 > 0 && (i4 = c4619sw.r) > 0) {
                            if (!c2939Zn.k) {
                                i5 = i9;
                                i6 = i3;
                            } else if ((i12 > i4) != (i9 > i3)) {
                                i6 = i9;
                                i5 = i3;
                            } else {
                                i5 = i9;
                                i6 = i3;
                            }
                            int i13 = i12 * i6;
                            int i14 = i4 * i5;
                            Point point = i13 >= i14 ? new Point(i5, Ug0.g(i14, i12)) : new Point(Ug0.g(i13, i4), i6);
                            int i15 = c4619sw.q;
                            int i16 = i15 * i4;
                            if (i15 >= ((int) (point.x * 0.98f)) && i4 >= ((int) (point.y * 0.98f)) && i16 < i10) {
                                i10 = i16;
                            }
                        }
                    }
                    i2 = i10;
                }
                C5086yC c5086yC = AC.b;
                FW.n(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i17 = 0;
                int i18 = 0;
                while (i17 < c3974ld0.f4655a) {
                    int iB = c3974ld0.d[i17].b();
                    C3469fo c3469fo = new C3469fo(i, c3974ld0, i17, c2939Zn, iArr[i17], i8, i2 == Integer.MAX_VALUE || (iB != -1 && iB <= i2));
                    int i19 = i18 + 1;
                    if (objArrCopyOf.length < i19) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i19));
                    }
                    objArrCopyOf[i18] = c3469fo;
                    i17++;
                    i18 = i19;
                }
                return AC.h(i18, objArrCopyOf);
            default:
                C2939Zn c2939Zn2 = (C2939Zn) obj2;
                String str = (String) obj;
                AbstractC2992aT abstractC2992aT2 = C3557go.j;
                C5086yC c5086yC2 = AC.b;
                FW.n(4, "initialCapacity");
                Object[] objArrCopyOf2 = new Object[4];
                int i20 = 0;
                int i21 = 0;
                while (i20 < c3974ld0.f4655a) {
                    C3204co c3204co = new C3204co(i, c3974ld0, i20, c2939Zn2, iArr[i20], str);
                    int i22 = i21 + 1;
                    if (objArrCopyOf2.length < i22) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, AbstractC2995aW.y(objArrCopyOf2.length, i22));
                    }
                    objArrCopyOf2[i21] = c3204co;
                    i20++;
                    i21 = i22;
                }
                return AC.h(i21, objArrCopyOf2);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return CoroutineAdapterKt.asListenableFuture$lambda$0((InterfaceC3732io) this.b, this.c, completer);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CI
    public final void b(Object obj, C3125bv c3125bv) {
        InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
        interfaceC3579h4.c((LU) this.c, new C3491g4(c3125bv, ((C4167nm) this.b).e));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
    public final Object execute() {
        int i = this.f4286a;
        Object obj = this.c;
        C5123yg0 c5123yg0 = (C5123yg0) this.b;
        switch (i) {
            case 1:
                Iterable iterable = (Iterable) obj;
                E20 e20 = (E20) c5123yg0.c;
                e20.getClass();
                if (iterable.iterator().hasNext()) {
                    e20.h().compileStatement("DELETE FROM events WHERE _id in " + E20.o(iterable)).execute();
                }
                break;
            default:
                c5123yg0.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    long jIntValue = ((Integer) entry.getValue()).intValue();
                    EnumC4302pJ enumC4302pJ = EnumC4302pJ.INVALID_PAYLOD;
                    String str = (String) entry.getKey();
                    E20 e21 = (E20) c5123yg0.i;
                    e21.getClass();
                    e21.k(new C5035xg0(str, enumC4302pJ, jIntValue));
                }
                break;
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        switch (this.f4286a) {
            case 3:
                ((InterfaceC3579h4) obj).getClass();
                break;
            case 4:
                ((InterfaceC3579h4) obj).getClass();
                break;
            case 5:
            default:
                Ih0 ih0 = (Ih0) this.c;
                ((InterfaceC3579h4) obj).a(ih0);
                int i = ih0.f3234a;
                break;
            case 6:
                ((InterfaceC3579h4) obj).getClass();
                break;
            case 7:
                ((InterfaceC3579h4) obj).getClass();
                break;
            case 8:
                ((InterfaceC3579h4) obj).getClass();
                break;
            case 9:
                ((InterfaceC3579h4) obj).getClass();
                break;
            case 10:
                ((InterfaceC3579h4) obj).getClass();
                break;
            case 11:
                ((InterfaceC3579h4) obj).getClass();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws Throwable {
        Integer numValueOf;
        Throwable th;
        HttpURLConnection httpURLConnection;
        switch (this.f4286a) {
            case 15:
                c(task);
                return task;
            case 16:
                d(task);
                return task;
            case 17:
                C2881Xh c2881Xh = (C2881Xh) this.b;
                Map map = (Map) this.c;
                int[] iArr = C2881Xh.k;
                return c2881Xh.b(0L, task, map);
            default:
                C2700Qi c2700Qi = (C2700Qi) this.b;
                Task task2 = (Task) this.c;
                int[] iArr2 = C2700Qi.p;
                c2700Qi.getClass();
                try {
                    if (!task2.isSuccessful()) {
                        throw new IOException(task2.getException());
                    }
                    c2700Qi.i(true);
                    httpURLConnection = (HttpURLConnection) task2.getResult();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        numValueOf = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                synchronized (c2700Qi) {
                                    c2700Qi.c = 8;
                                }
                                c2700Qi.o.e(0, C3633hi.f);
                                c2700Qi.k(httpURLConnection).c();
                            } catch (IOException unused) {
                                C2700Qi.b(httpURLConnection);
                                c2700Qi.i(false);
                                boolean z = numValueOf == null || C2700Qi.d(numValueOf.intValue());
                                if (z) {
                                    c2700Qi.l(new Date(c2700Qi.n.currentTimeMillis()));
                                }
                                if (z || numValueOf.intValue() == 200) {
                                    c2700Qi.h();
                                } else {
                                    String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strF = C2700Qi.f(httpURLConnection.getErrorStream());
                                    }
                                    new C2479Hu(numValueOf.intValue(), strF, 0);
                                }
                                return Tasks.forResult(null);
                            } catch (Throwable th2) {
                                th = th2;
                                C2700Qi.b(httpURLConnection);
                                c2700Qi.i(false);
                                boolean z2 = numValueOf == null || C2700Qi.d(numValueOf.intValue());
                                if (z2) {
                                    c2700Qi.l(new Date(c2700Qi.n.currentTimeMillis()));
                                }
                                if (z2 || numValueOf.intValue() == 200) {
                                    c2700Qi.h();
                                } else {
                                    String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                                    if (numValueOf.intValue() == 403) {
                                        strF2 = C2700Qi.f(httpURLConnection.getErrorStream());
                                    }
                                    new C2479Hu(numValueOf.intValue(), strF2, 0);
                                    c2700Qi.g();
                                }
                                throw th;
                            }
                        }
                        C2700Qi.b(httpURLConnection);
                        c2700Qi.i(false);
                        boolean zD = C2700Qi.d(responseCode);
                        if (zD) {
                            c2700Qi.l(new Date(c2700Qi.n.currentTimeMillis()));
                        }
                        if (zD || responseCode == 200) {
                            c2700Qi.h();
                        } else {
                            String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (responseCode == 403) {
                                strF3 = C2700Qi.f(httpURLConnection.getErrorStream());
                            }
                            new C2479Hu(responseCode, strF3, 0);
                            c2700Qi.g();
                        }
                    } catch (IOException unused2) {
                        numValueOf = null;
                    } catch (Throwable th3) {
                        numValueOf = null;
                        th = th3;
                    }
                    return Tasks.forResult(null);
                } catch (IOException unused3) {
                    httpURLConnection = null;
                    numValueOf = null;
                } catch (Throwable th4) {
                    numValueOf = null;
                    th = th4;
                    httpURLConnection = null;
                }
                break;
        }
    }
}
