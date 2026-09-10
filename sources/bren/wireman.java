package bren;

import com.google.android.gms.ads.RequestConfiguration;
import kurbash.formularize;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Interfaces.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J$\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0001H¦\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbren/wireman;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lbren/dern;", "thisRef", "Lkurbash/formularize;", "property", "getValue", "(Ljava/lang/Object;Lkurbash/formularize;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkurbash/formularize;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface wireman<T, V> extends dern<T, V> {
    @Override // bren.dern
    V getValue(T thisRef, formularize<?> property);

    void setValue(T thisRef, formularize<?> property, V value);
}
