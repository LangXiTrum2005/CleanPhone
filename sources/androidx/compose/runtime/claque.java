package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u0010!R\u001a\u0010\u000e\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0013\u0010#R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b$\u0010(R\u001a\u0010,\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b+\u0010*\u001a\u0004\b\u001c\u0010(R\u0014\u0010.\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010#¨\u0006/"}, d2 = {"Landroidx/compose/runtime/claque;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/preprohormone;", "compositionLocal", "value", "", "explicitNull", "Landroidx/compose/runtime/tailoring;", "mutationPolicy", "Landroidx/compose/runtime/czestochowa;", "state", "Lkotlin/Function1;", "compute", "isDynamic", "<init>", "(Landroidx/compose/runtime/preprohormone;Ljava/lang/Object;ZLandroidx/compose/runtime/tailoring;Landroidx/compose/runtime/czestochowa;Lkotlin/jvm/functions/Function1;Z)V", "impromptu", "()Landroidx/compose/runtime/claque;", "attabal", "Landroidx/compose/runtime/preprohormone;", "saneness", "()Landroidx/compose/runtime/preprohormone;", "Z", "dern", "Landroidx/compose/runtime/tailoring;", "marial", "()Landroidx/compose/runtime/tailoring;", "wireman", "Landroidx/compose/runtime/czestochowa;", "beachfront", "()Landroidx/compose/runtime/czestochowa;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "taiyuan", "()Z", "competently", "Ljava/lang/Object;", "providedValue", "canOverride", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime$annotations", "effectiveValue", "cutely", "isStatic", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class claque<T> {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int f5860taiyuan = 8;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final preprohormone<T> compositionLocal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final boolean isDynamic;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final T providedValue;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final tailoring<T> mutationPolicy;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public boolean canOverride = true;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Function1<Object, T> compute;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean explicitNull;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final czestochowa<T> state;

    /* JADX WARN: Multi-variable type inference failed */
    public claque(preprohormone<T> preprohormoneVar, T t, boolean z, tailoring<T> tailoringVar, czestochowa<T> czestochowaVar, Function1<Object, ? extends T> function1, boolean z2) {
        this.compositionLocal = preprohormoneVar;
        this.explicitNull = z;
        this.mutationPolicy = tailoringVar;
        this.state = czestochowaVar;
        this.compute = function1;
        this.isDynamic = z2;
        this.providedValue = t;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final czestochowa<T> beachfront() {
        return this.state;
    }

    public final T competently() {
        return this.providedValue;
    }

    public final boolean cutely() {
        return (this.explicitNull || competently() != null) && !this.isDynamic;
    }

    public final Function1<Object, T> dern() {
        return this.compute;
    }

    public final claque<T> impromptu() {
        this.canOverride = false;
        return this;
    }

    public final tailoring<T> marial() {
        return this.mutationPolicy;
    }

    public final preprohormone<T> saneness() {
        return this.compositionLocal;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public final T wireman() {
        if (this.explicitNull) {
            return null;
        }
        czestochowa<T> czestochowaVar = this.state;
        if (czestochowaVar != null) {
            return czestochowaVar.getValue();
        }
        T t = this.providedValue;
        if (t != null) {
            return t;
        }
        polloi.dovishness("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
