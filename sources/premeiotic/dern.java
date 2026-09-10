package premeiotic;

import android.text.style.TtsSpan;
import clubfoot.VerbatimTtsAnnotation;
import clubfoot.taiyuan;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TtsAnnotationExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lclubfoot/taiyuan;", "Landroid/text/style/TtsSpan;", "attabal", "(Lclubfoot/taiyuan;)Landroid/text/style/TtsSpan;", "Lclubfoot/apical;", "saneness", "(Lclubfoot/apical;)Landroid/text/style/TtsSpan;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class dern {
    public static final TtsSpan attabal(taiyuan taiyuanVar) {
        if (taiyuanVar instanceof VerbatimTtsAnnotation) {
            return saneness((VerbatimTtsAnnotation) taiyuanVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan saneness(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
