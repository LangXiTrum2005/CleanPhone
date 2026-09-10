package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Latch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u00060\u0001j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/cultivated;", "", "<init>", "()V", "", "wireman", "beachfront", "dern", "(Lwretchedly/dern;)Ljava/lang/Object;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "attabal", "Ljava/lang/Object;", "lock", "", "Lwretchedly/dern;", "saneness", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "marial", "()Z", "isOpen", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cultivated {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Object lock = new Object();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public List<wretchedly.dern<Unit>> awaiters = new ArrayList();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public List<wretchedly.dern<Unit>> spareList = new ArrayList();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public boolean _isOpen = true;

    /* JADX INFO: compiled from: Latch.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.impassible<Unit> f5914arytenoidectomy;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(kotlinx.coroutines.impassible<? super Unit> impassibleVar) {
            this.f5914arytenoidectomy = impassibleVar;
        }

        public final void attabal(Throwable th) {
            Object obj = cultivated.this.lock;
            cultivated cultivatedVar = cultivated.this;
            kotlinx.coroutines.impassible<Unit> impassibleVar = this.f5914arytenoidectomy;
            synchronized (obj) {
                cultivatedVar.awaiters.remove(impassibleVar);
                Unit unit = Unit.f29295attabal;
            }
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            attabal(th);
            return Unit.f29295attabal;
        }
    }

    public final void beachfront() {
        synchronized (this.lock) {
            try {
                if (marial()) {
                    return;
                }
                List<wretchedly.dern<Unit>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    wretchedly.dern<Unit> dernVar = list.get(i);
                    Result.Companion companion = Result.INSTANCE;
                    dernVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
                }
                list.clear();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object dern(wretchedly.dern<? super Unit> dernVar) {
        if (marial()) {
            return Unit.f29295attabal;
        }
        kotlinx.coroutines.kowloon kowloonVar = new kotlinx.coroutines.kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        synchronized (this.lock) {
            this.awaiters.add(kowloonVar);
        }
        kowloonVar.beachfront(new attabal(kowloonVar));
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCuirassed : Unit.f29295attabal;
    }

    public final boolean marial() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void wireman() {
        synchronized (this.lock) {
            this._isOpen = false;
            Unit unit = Unit.f29295attabal;
        }
    }
}
