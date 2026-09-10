package androidx.compose.ui.semantics;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR0\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "name", "Lkotlin/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "isImportantForAccessibility", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "parentValue", "childValue", "dern", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/monoploid;", "thisRef", "Lkurbash/formularize;", "property", "value", "", "wireman", "(Landroidx/compose/ui/semantics/monoploid;Lkurbash/formularize;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "attabal", "Lkotlin/jvm/functions/Function2;", "getMergePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "<set-?>", "saneness", "Z", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SemanticsPropertyKey<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function2<T, T, T> mergePolicy;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean isImportantForAccessibility;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.name = str;
        this.mergePolicy = function2;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final T dern(T parentValue, T childValue) {
        return this.mergePolicy.invoke(parentValue, childValue);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final boolean getIsImportantForAccessibility() {
        return this.isImportantForAccessibility;
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public final void wireman(monoploid thisRef, kurbash.formularize<?> property, T value) {
        thisRef.saneness(this, value);
    }

    public /* synthetic */ SemanticsPropertyKey(String str, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Function2<T, T, T>() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // p002kotlin.jvm.functions.Function2
            public final T invoke(T t, T t2) {
                return t == null ? t2 : t;
            }
        } : function2);
    }

    public SemanticsPropertyKey(String str, boolean z) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z;
    }

    public SemanticsPropertyKey(String str, boolean z, Function2<? super T, ? super T, ? extends T> function2) {
        this(str, function2);
        this.isImportantForAccessibility = z;
    }
}
