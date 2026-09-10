package forkful;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.technofreak;
import p002kotlin.Metadata;
import pigboat.arytenoidectomy;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lforkful/attabal;", "Lpigboat/arytenoidectomy;", "<init>", "()V", "", "allFactories", "Lkotlinx/coroutines/technofreak;", "saneness", "(Ljava/util/List;)Lkotlinx/coroutines/technofreak;", "", "attabal", "()Ljava/lang/String;", "", "dern", "()I", "loadPriority", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class attabal implements arytenoidectomy {
    @Override // pigboat.arytenoidectomy
    public String attabal() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // pigboat.arytenoidectomy
    public int dern() {
        return 1073741823;
    }

    @Override // pigboat.arytenoidectomy
    public technofreak saneness(List<? extends arytenoidectomy> allFactories) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new beachfront(impromptu.attabal(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
