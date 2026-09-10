package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4813v60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5119a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public C4813v60(IX ix, AbstractC2865Wr abstractC2865Wr, C4352ps c4352ps, InterfaceC4264os interfaceC4264os) {
        AbstractC2995aW.q(abstractC2865Wr, "eventListener");
        this.b = ix;
        this.c = abstractC2865Wr;
        this.d = c4352ps;
        this.e = interfaceC4264os;
        this.f = interfaceC4264os.d();
    }

    public static C4813v60 b(SharedPreferences sharedPreferences, Executor executor) {
        C4813v60 c4813v60 = new C4813v60(sharedPreferences, executor);
        synchronized (((ArrayDeque) c4813v60.e)) {
            try {
                ((ArrayDeque) c4813v60.e).clear();
                String string = ((SharedPreferences) c4813v60.b).getString((String) c4813v60.c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) c4813v60.d)) {
                    String[] strArrSplit = string.split((String) c4813v60.d, -1);
                    int length = strArrSplit.length;
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c4813v60.e).add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4813v60;
    }

    public final IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            h(iOException);
        }
        Object obj = this.c;
        Object obj2 = this.b;
        if (z2) {
            if (iOException != null) {
                ((AbstractC2865Wr) obj).requestFailed((IX) obj2, iOException);
            } else {
                ((AbstractC2865Wr) obj).requestBodyEnd((IX) obj2, j);
            }
        }
        if (z) {
            if (iOException != null) {
                ((AbstractC2865Wr) obj).responseFailed((IX) obj2, iOException);
            } else {
                ((AbstractC2865Wr) obj).responseBodyEnd((IX) obj2, j);
            }
        }
        return ((IX) obj2).h(this, z2, z, iOException);
    }

    public final C4088ms c(HY hy, boolean z) {
        this.f5119a = z;
        NY ny = hy.d;
        AbstractC2995aW.n(ny);
        long jContentLength = ny.contentLength();
        ((AbstractC2865Wr) this.c).requestBodyStart((IX) this.b);
        return new C4088ms(this, ((InterfaceC4264os) this.e).h(hy, jContentLength), jContentLength);
    }

    public final void d() throws IOException {
        try {
            ((InterfaceC4264os) this.e).g();
        } catch (IOException e) {
            ((AbstractC2865Wr) this.c).requestFailed((IX) this.b, e);
            h(e);
            throw e;
        }
    }

    public final String e() {
        String str;
        synchronized (((ArrayDeque) this.e)) {
            str = (String) ((ArrayDeque) this.e).peek();
        }
        return str;
    }

    public final C4845vZ f(boolean z) throws IOException {
        try {
            C4845vZ c4845vZF = ((InterfaceC4264os) this.e).f(z);
            if (c4845vZF != null) {
                c4845vZF.m = this;
            }
            return c4845vZF;
        } catch (IOException e) {
            ((AbstractC2865Wr) this.c).responseFailed((IX) this.b, e);
            h(e);
            throw e;
        }
    }

    public final boolean g(String str) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.e)) {
            zRemove = ((ArrayDeque) this.e).remove(str);
            if (zRemove && !this.f5119a) {
                ((Executor) this.f).execute(new RunnableC2928Zc(this, 19));
            }
        }
        return zRemove;
    }

    public final void h(IOException iOException) {
        ((C4352ps) this.d).c(iOException);
        KX kxD = ((InterfaceC4264os) this.e).d();
        IX ix = (IX) this.b;
        synchronized (kxD) {
            try {
                AbstractC2995aW.q(ix, NotificationCompat.CATEGORY_CALL);
                if (iOException instanceof L90) {
                    if (((L90) iOException).f3342a == EnumC2502Ir.REFUSED_STREAM) {
                        int i = kxD.n + 1;
                        kxD.n = i;
                        if (i > 1) {
                            kxD.j = true;
                            kxD.l++;
                        }
                    } else if (((L90) iOException).f3342a != EnumC2502Ir.CANCEL || !ix.p) {
                        kxD.j = true;
                        kxD.l++;
                    }
                } else if (kxD.g == null || (iOException instanceof C3809jj)) {
                    kxD.j = true;
                    if (kxD.m == 0) {
                        KX.d(ix.f3221a, kxD.b, iOException);
                        kxD.l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C4813v60(SharedPreferences sharedPreferences, Executor executor) {
        this.e = new ArrayDeque();
        this.f5119a = false;
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.d = ",";
        this.f = executor;
    }
}
