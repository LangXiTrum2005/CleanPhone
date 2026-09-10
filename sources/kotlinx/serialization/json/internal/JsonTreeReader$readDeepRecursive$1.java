package kotlinx.serialization.json.internal;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpatroclinal/saneness;", "", "Lcutwater/impromptu;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 0, 0})
@igo.wireman(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements tetrahedral.triweekly<patroclinal.saneness<Unit, cutwater.impromptu>, Unit, wretchedly.dern<? super cutwater.impromptu>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, wretchedly.dern<? super JsonTreeReader$readDeepRecursive$1> dernVar) {
        super(3, dernVar);
        this.this$0 = jsonTreeReader;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            patroclinal.saneness sanenessVar = (patroclinal.saneness) this.L$0;
            byte bSealless = this.this$0.lexer.sealless();
            if (bSealless == 1) {
                return this.this$0.cutely(true);
            }
            if (bSealless == 0) {
                return this.this$0.cutely(false);
            }
            if (bSealless != 6) {
                if (bSealless == 8) {
                    return this.this$0.beachfront();
                }
                JsonReader.rotuma(this.this$0.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            JsonTreeReader jsonTreeReader = this.this$0;
            this.label = 1;
            obj = jsonTreeReader.taiyuan(sanenessVar, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return (cutwater.impromptu) obj;
    }

    @Override // tetrahedral.triweekly
    public final Object invoke(patroclinal.saneness<Unit, cutwater.impromptu> sanenessVar, Unit unit, wretchedly.dern<? super cutwater.impromptu> dernVar) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, dernVar);
        jsonTreeReader$readDeepRecursive$1.L$0 = sanenessVar;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(Unit.f29295attabal);
    }
}
