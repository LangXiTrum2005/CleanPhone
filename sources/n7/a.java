package n7;

import com.facebook.appevents.internal.FileDownloadTask;
import com.facebook.appevents.ml.ModelManager;
import i1.i0;
import java.io.File;
import java.util.List;
import l1.k;
import q1.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements FileDownloadTask.Callback, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f46624b;

    public /* synthetic */ a(List list, int i10) {
        this.f46623a = i10;
        this.f46624b = list;
    }

    @Override // l1.k
    public void invoke(Object obj) {
        switch (this.f46623a) {
            case 1:
                ((i0) obj).onCues(this.f46624b);
                break;
            default:
                ((b) obj).getClass();
                break;
        }
    }

    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
    public void onComplete(File file) {
        ModelManager.TaskHandler.Companion.execute$lambda$1(this.f46624b, file);
    }

    public /* synthetic */ a(q1.a aVar, List list) {
        this.f46623a = 2;
        this.f46624b = list;
    }
}
