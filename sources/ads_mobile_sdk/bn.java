package ads_mobile_sdk;

import java.util.NoSuchElementException;
import saneness.incorrectly;

/* JADX INFO: loaded from: classes.dex */
public final class bn extends incorrectly {
    public int a = 0;
    public final int b;
    public final /* synthetic */ kn c;

    public bn(kn knVar) {
        this.c = knVar;
        this.b = knVar.size();
    }

    @Override // saneness.rostrated
    public final byte a() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }
}
