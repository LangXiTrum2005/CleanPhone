package androidx.compose.ui.text.input;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.attabal, reason: from toString */
/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/input/attabal;", "Landroidx/compose/ui/text/input/impassible;", "Landroidx/compose/ui/text/attabal;", "annotatedString", "", "newCursorPosition", "<init>", "(Landroidx/compose/ui/text/attabal;I)V", "", "text", "(Ljava/lang/String;I)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Landroidx/compose/ui/text/attabal;", "getAnnotatedString", "()Landroidx/compose/ui/text/attabal;", "saneness", "I", "getNewCursorPosition", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommitTextCommand implements impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.text.attabal annotatedString;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final int newCursorPosition;

    public CommitTextCommand(androidx.compose.ui.text.attabal attabalVar, int i) {
        this.annotatedString = attabalVar;
        this.newCursorPosition = i;
    }

    public final String attabal() {
        return this.annotatedString.getText();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) other;
        return Intrinsics.wireman(attabal(), commitTextCommand.attabal()) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public int hashCode() {
        return (attabal().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + attabal() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    public CommitTextCommand(String str, int i) {
        this(new androidx.compose.ui.text.attabal(str, null, null, 6, null), i);
    }
}
