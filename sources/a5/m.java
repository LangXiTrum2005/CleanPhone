package a5;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import com.applovin.impl.da;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import wj.r;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements y4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile m f3405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f3406d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f3408b = new CopyOnWriteArrayList();

    public m(k kVar) {
        this.f3407a = kVar;
        if (kVar != null) {
            kVar.d(new n5.f(this, 1));
        }
    }

    @Override // y4.a
    public final void a(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (f3406d) {
            try {
                if (this.f3407a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (l lVar : this.f3408b) {
                    if (lVar.f3403b == dVar) {
                        arrayList.add(lVar);
                    }
                }
                this.f3408b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((l) it.next()).f3402a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f3408b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((l) it2.next()).f3402a.equals(activity)) {
                                }
                            }
                        }
                    }
                    a aVar = this.f3407a;
                    if (aVar != null) {
                        ((k) aVar).b(activity);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // y4.a
    public final void b(Context context, da daVar, com.applovin.impl.sdk.ad.d dVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        r rVar = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        v vVar = v.f53866a;
        if (activity != null) {
            ReentrantLock reentrantLock = f3406d;
            reentrantLock.lock();
            try {
                a aVar = this.f3407a;
                if (aVar == null) {
                    dVar.accept(new x4.i(vVar));
                    reentrantLock.unlock();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f3408b;
                boolean z10 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (((l) it.next()).f3402a.equals(activity)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                l lVar = new l(activity, daVar, dVar);
                copyOnWriteArrayList.add(lVar);
                if (z10) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!activity.equals(((l) next).f3402a));
                    l lVar2 = (l) next;
                    x4.i iVar = lVar2 != null ? lVar2.f3404c : null;
                    if (iVar != null) {
                        lVar.f3404c = iVar;
                        lVar.f3403b.accept(iVar);
                    }
                } else {
                    k kVar = (k) aVar;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        kVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new j(kVar, activity));
                    }
                }
                reentrantLock.unlock();
                rVar = r.f53297a;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (rVar == null) {
            dVar.accept(new x4.i(vVar));
        }
    }
}
