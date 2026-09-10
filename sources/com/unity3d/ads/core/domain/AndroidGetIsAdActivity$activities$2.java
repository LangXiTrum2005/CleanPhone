package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import lo.h;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Llo/h;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AndroidGetIsAdActivity$activities$2 extends o implements jk.a {
    final /* synthetic */ AndroidGetIsAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetIsAdActivity$activities$2(AndroidGetIsAdActivity androidGetIsAdActivity) {
        super(0);
        this.this$0 = androidGetIsAdActivity;
    }

    @Override // jk.a
    public final List<h> invoke() {
        List<ByteString> observableAndroidActivitiesList = this.this$0.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        n.e(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
        List<ByteString> list = observableAndroidActivitiesList;
        ArrayList arrayList = new ArrayList(p.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            byte[] data = Arrays.copyOf(byteArray, byteArray.length);
            h hVar = h.f45638d;
            n.f(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            n.e(bArrCopyOf, "copyOf(this, size)");
            arrayList.add(new h(bArrCopyOf));
        }
        return arrayList;
    }
}
