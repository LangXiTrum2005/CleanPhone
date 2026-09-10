package androidx.compose.ui.text.font;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.rotuma, reason: from toString */
/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/rotuma;", "Landroidx/compose/ui/text/font/taiyuan;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/font/restrictive;", "dovishness", "Landroidx/compose/ui/text/font/restrictive;", "saneness", "()Landroidx/compose/ui/text/font/restrictive;", "typeface", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoadedFontFamily extends taiyuan {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata and from toString */
    public final restrictive typeface;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoadedFontFamily) && Intrinsics.wireman(this.typeface, ((LoadedFontFamily) other).typeface);
    }

    public int hashCode() {
        return this.typeface.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final restrictive getTypeface() {
        return this.typeface;
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.typeface + ')';
    }
}
