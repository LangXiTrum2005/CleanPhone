package potboil;

import okhttp3.stratoscope;
import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: EmptyResponseConverter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpotboil/saneness;", "Lpotboil/attabal;", "Lokhttp3/stratoscope;", "Ljava/lang/Void;", "<init>", "()V", "responseBody", "convert", "(Lokhttp3/stratoscope;)Ljava/lang/Void;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class saneness implements attabal<stratoscope, Void> {
    @Override // potboil.attabal
    public Void convert(stratoscope responseBody) {
        if (responseBody != null) {
            try {
                responseBody.close();
                Unit unit = Unit.f29295attabal;
                interaction.saneness.attabal(responseBody, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    interaction.saneness.attabal(responseBody, th);
                    throw th2;
                }
            }
        }
        return null;
    }
}
