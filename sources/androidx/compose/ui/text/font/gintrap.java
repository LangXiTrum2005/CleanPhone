package androidx.compose.ui.text.font;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/gintrap;", "Landroidx/compose/ui/text/font/supplicat;", "", "name", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "saneness", "dovishness", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class gintrap extends supplicat {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final String fontFamilyName;
    private final String name;

    public gintrap(String str, String str2) {
        super(null);
        this.name = str;
        this.fontFamilyName = str2;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getFontFamilyName() {
        return this.fontFamilyName;
    }
}
