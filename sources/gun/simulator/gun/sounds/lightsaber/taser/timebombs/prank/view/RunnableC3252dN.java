package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.StrictMode;
import android.view.SurfaceHolder;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3252dN implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4268a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC3252dN(int i, Object obj, Object obj2) {
        this.f4268a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        int i = this.f4268a;
        C2914Yo c2914Yo = AbstractC2940Zo.f4092a;
        int i2 = 0;
        switch (i) {
            case 0:
                boolean z = C3778jN.b;
                Object obj = this.c;
                if (!z) {
                    ((ServiceConnectionC3340eN) obj).a();
                    throw null;
                }
                Objects.toString((ComponentName) this.b);
                AbstractC3950lJ.z(((ServiceConnectionC3340eN) obj).b);
                throw null;
            case 1:
                ((EM) this.b).g.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) ((BM) this.c).f2867a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(((EM) this.b).g, 1);
                    return;
                }
                return;
            case 2:
                Process.setThreadPriority(10);
                ((Runnable) this.b).run();
                return;
            case 3:
                ThreadFactoryC3304dy threadFactoryC3304dy = (ThreadFactoryC3304dy) this.c;
                if (threadFactoryC3304dy.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.b).run();
                    return;
                } catch (Throwable th) {
                    threadFactoryC3304dy.c.x(th);
                    return;
                }
            case 4:
                try {
                    if (((Vo0) this.c).d == null) {
                        Object obj2 = this.c;
                        ((Vo0) obj2).d = ((Vo0) obj2).b.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                    } else {
                        ((Vo0) this.c).d.clearBindings();
                    }
                    ((Vo0) this.c).d.bindString(1, ((KK) this.b).f3311a);
                    ((Vo0) this.c).d.bindString(2, ((KK) this.b).b);
                    ((Vo0) this.c).d.bindLong(3, ((KK) this.b).c);
                    ((Vo0) this.c).d.bindLong(4, ((KK) this.b).d);
                    ((Vo0) this.c).d.bindString(5, ((KK) this.b).e);
                    ((Vo0) this.c).d.executeInsert();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                AbstractC4783um0 abstractC4783um0 = (AbstractC4783um0) this.c;
                AbstractC4783um0.JVA(abstractC4783um0);
                if (abstractC4783um0.NXR != null) {
                    abstractC4783um0.NXR.obtainMessage(111, (SurfaceTexture) this.b).sendToTarget();
                    return;
                }
                return;
            case 6:
                AbstractC4783um0 abstractC4783um1 = (AbstractC4783um0) this.c;
                AbstractC4783um0.JVA(abstractC4783um1);
                if (abstractC4783um1.NXR != null) {
                    abstractC4783um1.NXR.obtainMessage(110, (SurfaceHolder) this.b).sendToTarget();
                    return;
                }
                return;
            case 7:
                AbstractC4783um0 abstractC4783um2 = (AbstractC4783um0) this.c;
                AbstractC4783um0.JVA(abstractC4783um2);
                if (abstractC4783um2.NXR != null) {
                    abstractC4783um2.NXR.obtainMessage(107, (Uo0) this.b).sendToTarget();
                    return;
                }
                return;
            case 8:
                AbstractC3950lJ.z(this.b);
                return;
            case 9:
                ((WebView) this.b).destroy();
                return;
            case 10:
                ((WebView) this.b).destroy();
                return;
            case 11:
                ((WebView) this.b).destroy();
                return;
            case 12:
                try {
                    HashSet hashSet = (HashSet) this.b;
                    if (hashSet == null || hashSet.isEmpty()) {
                        return;
                    }
                    for (String str : (HashSet) this.b) {
                        C4312pT c4312pT = (C4312pT) this.c;
                        C4312pT c4312pT2 = C4312pT.n;
                        c4312pT.getClass();
                        String strP = C4312pT.p(str);
                        String absolutePath = C3044b1.b.j().getExternalCacheDir().getAbsolutePath();
                        StringBuilder sb = new StringBuilder();
                        sb.append(absolutePath);
                        sb.append(File.separator);
                        byte[] bArr = {80, -45, -82, -101, 107, 41, -116, 47};
                        byte[] bArr2 = {52, -93, -38, -40, 10, 74, -28, 74};
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < 8) {
                            if (i4 >= 8) {
                                i4 = 0;
                            }
                            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i4]);
                            i3++;
                            i4++;
                        }
                        sb.append(new String(bArr, StandardCharsets.UTF_8));
                        File file = new File(sb.toString());
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        if (!new File(file, strP).exists()) {
                            AbstractC2789Tt.a(str, file.getAbsolutePath(), strP, new Dn0(this, 7));
                        }
                        break;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 13:
                RunnableC3163cN runnableC3163cN = (RunnableC3163cN) this.c;
                if (((WeakReference) runnableC3163cN.c).get() == null || ((WeakReference) runnableC3163cN.b).get() == null) {
                    return;
                }
                com.bumptech.glide.a.d((Context) ((WeakReference) runnableC3163cN.c).get()).i(Drawable.class).z((File) this.b).w((ImageView) ((WeakReference) runnableC3163cN.b).get());
                return;
            case 14:
                Object obj3 = this.c;
                try {
                    if (((WeakReference) ((RunnableC3163cN) obj3).b).get() == null || ((WeakReference) ((RunnableC3163cN) obj3).c).get() == null) {
                        return;
                    }
                    com.bumptech.glide.a.d((Context) ((WeakReference) ((RunnableC3163cN) obj3).c).get()).i(Drawable.class).z((Bitmap) this.b).a((ZY) new ZY().d(c2914Yo)).w((ImageView) ((WeakReference) ((RunnableC3163cN) obj3).b).get());
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 15:
                Object obj4 = this.c;
                try {
                    if (((WeakReference) ((RunnableC3163cN) ((C3844k50) obj4).e).b).get() == null || ((WeakReference) ((RunnableC3163cN) ((C3844k50) obj4).e).c).get() == null) {
                        return;
                    }
                    com.bumptech.glide.a.d((Context) ((WeakReference) ((RunnableC3163cN) ((C3844k50) obj4).e).c).get()).i(Drawable.class).z((Bitmap) this.b).a((ZY) new ZY().d(c2914Yo)).w((ImageView) ((WeakReference) ((RunnableC3163cN) ((C3844k50) obj4).e).b).get());
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    return;
                }
            case 16:
                ((InterfaceC2772Tc) this.b).r((C3217cz) this.c);
                return;
            case 17:
                break;
            default:
                ViewTreeObserver viewTreeObserver = ((Activity) this.b).getWindow().getDecorView().getViewTreeObserver();
                ViewTreeObserverOnDrawListenerC4267ov viewTreeObserverOnDrawListenerC4267ov = new ViewTreeObserverOnDrawListenerC4267ov(this);
                C4355pv c4355pv = (C4355pv) this.c;
                c4355pv.b.put(((Activity) this.b).getClass(), viewTreeObserverOnDrawListenerC4267ov);
                viewTreeObserver.addOnDrawListener((ViewTreeObserver.OnDrawListener) c4355pv.b.get(((Activity) this.b).getClass()));
                return;
        }
        while (true) {
            try {
                ((Runnable) this.b).run();
            } catch (Throwable th2) {
                AbstractC2995aW.Q(C2734Rq.f3684a, th2);
            }
            C4564sI c4564sI = (C4564sI) this.c;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C4564sI.f;
            Runnable runnableN = c4564sI.n();
            if (runnableN == null) {
                return;
            }
            this.b = runnableN;
            i2++;
            if (i2 >= 16 && c4564sI.f4971a.isDispatchNeeded(c4564sI)) {
                c4564sI.f4971a.dispatch(c4564sI, this);
                return;
            }
        }
    }

    public RunnableC3252dN(C4434qn0 c4434qn0) {
        this.f4268a = 9;
        this.c = c4434qn0;
        this.b = c4434qn0.g;
    }

    public RunnableC3252dN(C4697tn0 c4697tn0) {
        this.f4268a = 10;
        this.c = c4697tn0;
        this.b = c4697tn0.g;
    }

    public RunnableC3252dN(C4961wn0 c4961wn0) {
        this.f4268a = 11;
        this.c = c4961wn0;
        this.b = c4961wn0.g;
    }

    public /* synthetic */ RunnableC3252dN(Object obj, Object obj2, int i) {
        this.f4268a = i;
        this.b = obj;
        this.c = obj2;
    }
}
