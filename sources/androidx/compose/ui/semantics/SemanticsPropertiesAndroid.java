package androidx.compose.ui.semantics;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SemanticsProperties.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "saneness", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "attabal", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId$annotations", "TestTagsAsResourceId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SemanticsPropertiesAndroid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final SemanticsPropertiesAndroid f7595attabal = new SemanticsPropertiesAndroid();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new Function2<Boolean, Boolean, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean invoke(Boolean bool, boolean z) {
            return bool;
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return invoke(bool, bool2.booleanValue());
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f7596dern = 8;

    public final SemanticsPropertyKey<Boolean> attabal() {
        return TestTagsAsResourceId;
    }
}
