package androidx.compose.ui.text.font;

import androidx.compose.runtime.tout;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/grimness;", "Landroidx/compose/runtime/tout;", "", "", "saneness", "()Z", "cacheable", "attabal", "Landroidx/compose/ui/text/font/grimness$attabal;", "Landroidx/compose/ui/text/font/grimness$saneness;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface grimness extends tout<Object> {

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/grimness$attabal;", "Landroidx/compose/ui/text/font/grimness;", "Landroidx/compose/runtime/tout;", "", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "current", "<init>", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "kowloon", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getCurrent$ui_text_release", "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getValue", "()Ljava/lang/Object;", "value", "", "saneness", "()Z", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements grimness, tout<Object> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final AsyncFontListLoader current;

        public attabal(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.runtime.tout, androidx.compose.runtime.czestochowa
        public Object getValue() {
            return this.current.getValue();
        }

        @Override // androidx.compose.ui.text.font.grimness
        /* JADX INFO: renamed from: saneness */
        public boolean getCacheable() {
            return this.current.getCacheable();
        }
    }

    /* JADX INFO: renamed from: saneness */
    boolean getCacheable();

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/grimness$saneness;", "Landroidx/compose/ui/text/font/grimness;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "kowloon", "Z", "saneness", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness implements grimness {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final boolean cacheable;
        private final Object value;

        public saneness(Object obj, boolean z) {
            this.value = obj;
            this.cacheable = z;
        }

        @Override // androidx.compose.runtime.tout, androidx.compose.runtime.czestochowa
        public Object getValue() {
            return this.value;
        }

        @Override // androidx.compose.ui.text.font.grimness
        /* JADX INFO: renamed from: saneness, reason: from getter */
        public boolean getCacheable() {
            return this.cacheable;
        }

        public /* synthetic */ saneness(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}
