package androidx.p001lifecycle;

import androidx.p001lifecycle.starveling;
import cig.CreationExtras;
import kurbash.wireman;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/walach;", "Landroidx/lifecycle/starveling;", "VM", "Lpatroclinal/taiyuan;", "Lkurbash/wireman;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/mathsort;", "storeProducer", "Landroidx/lifecycle/peridotite$dern;", "factoryProducer", "Lcig/attabal;", "extrasProducer", "<init>", "(Lkurbash/wireman;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "isInitialized", "()Z", "kowloon", "Lkurbash/wireman;", "arytenoidectomy", "Lkotlin/jvm/functions/Function0;", "monoploid", "polloi", "molybdenite", "Landroidx/lifecycle/starveling;", "cached", "attabal", "()Landroidx/lifecycle/starveling;", "value", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class walach<VM extends starveling> implements taiyuan<VM> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Function0<mathsort> storeProducer;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final wireman<VM> viewModelClass;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public VM cached;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Function0<peridotite.dern> factoryProducer;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Function0<CreationExtras> extrasProducer;

    /* JADX WARN: Multi-variable type inference failed */
    public walach(wireman<VM> viewModelClass, Function0<? extends mathsort> storeProducer, Function0<? extends peridotite.dern> factoryProducer, Function0<? extends CreationExtras> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // patroclinal.taiyuan
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) peridotite.INSTANCE.attabal(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).dern(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    @Override // patroclinal.taiyuan
    public boolean isInitialized() {
        return this.cached != null;
    }
}
