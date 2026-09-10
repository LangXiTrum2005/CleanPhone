package androidx.compose.ui.modifier;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0090\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/modifier/attabal;", "Landroidx/compose/ui/modifier/beachfront;", "Landroidx/compose/ui/modifier/taiyuan;", "element", "<init>", "(Landroidx/compose/ui/modifier/taiyuan;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/modifier/dern;", X3.i.W, "saneness", "(Landroidx/compose/ui/modifier/dern;)Ljava/lang/Object;", "", "attabal", "(Landroidx/compose/ui/modifier/dern;)Z", "Landroidx/compose/ui/modifier/taiyuan;", "getElement", "()Landroidx/compose/ui/modifier/taiyuan;", "dern", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal extends beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public taiyuan<?> element;

    public attabal(taiyuan<?> taiyuanVar) {
        super(null);
        this.element = taiyuanVar;
    }

    @Override // androidx.compose.ui.modifier.beachfront
    public boolean attabal(dern<?> key) {
        return key == this.element.getKey();
    }

    public final void dern(taiyuan<?> taiyuanVar) {
        this.element = taiyuanVar;
    }

    @Override // androidx.compose.ui.modifier.beachfront
    public <T> T saneness(dern<T> key) {
        if (!(key == this.element.getKey())) {
            peridotite.attabal.saneness("Check failed.");
        }
        return (T) this.element.getValue();
    }
}
