package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/technofreak;", "Lkotlinx/coroutines/merc;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "sayid", "(ILjava/lang/String;)Lkotlinx/coroutines/merc;", "underbelly", "czestochowa", "()Lkotlinx/coroutines/technofreak;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class technofreak extends merc {
    public abstract technofreak czestochowa();

    @Override // kotlinx.coroutines.merc
    public merc sayid(int parallelism, String name) {
        pigboat.apical.attabal(parallelism);
        return pigboat.apical.saneness(this, name);
    }

    @Override // kotlinx.coroutines.merc
    public String toString() {
        String strUnderbelly = underbelly();
        if (strUnderbelly != null) {
            return strUnderbelly;
        }
        return creditor.attabal(this) + '@' + creditor.saneness(this);
    }

    public final String underbelly() {
        technofreak technofreakVarCzestochowa;
        technofreak technofreakVarDern = premeiotic.dern();
        if (this == technofreakVarDern) {
            return "Dispatchers.Main";
        }
        try {
            technofreakVarCzestochowa = technofreakVarDern.czestochowa();
        } catch (UnsupportedOperationException unused) {
            technofreakVarCzestochowa = null;
        }
        if (this == technofreakVarCzestochowa) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
