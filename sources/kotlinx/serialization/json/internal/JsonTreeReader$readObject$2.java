package kotlinx.serialization.json.internal;

import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@igo.wireman(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, wretchedly.dern<? super JsonTreeReader$readObject$2> dernVar) {
        super(dernVar);
        this.this$0 = jsonTreeReader;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.taiyuan(null, this);
    }
}
