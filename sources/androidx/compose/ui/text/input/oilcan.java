package androidx.compose.ui.text.input;

import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: TextInputService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R(\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/input/oilcan;", "", "Landroidx/compose/ui/text/input/rotuma;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/rotuma;)V", "attabal", "Landroidx/compose/ui/text/input/rotuma;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "saneness", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@patroclinal.wireman
public class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final rotuma platformTextInputService;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final AtomicReference<Object> _currentInputSession = new AtomicReference<>(null);

    public oilcan(rotuma rotumaVar) {
        this.platformTextInputService = rotumaVar;
    }
}
