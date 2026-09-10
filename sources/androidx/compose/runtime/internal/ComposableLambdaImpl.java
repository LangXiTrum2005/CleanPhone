package androidx.compose.runtime.internal;

import androidx.compose.runtime.hardpan;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.licking;
import androidx.compose.runtime.outmarry;
import androidx.compose.runtime.taiyuan;
import com.ironsource.X3;
import cuirassed.attabal;
import cuirassed.wireman;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.AdaptedFunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;
import tetrahedral.monoploid;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Lcuirassed/attabal;", "", X3.i.W, "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "", "taiyuan", "()V", "Landroidx/compose/runtime/taiyuan;", "composer", "impromptu", "(Landroidx/compose/runtime/taiyuan;)V", "formularize", "(Ljava/lang/Object;)V", "c", "changed", "dern", "(Landroidx/compose/runtime/taiyuan;I)Ljava/lang/Object;", "p1", "wireman", "(Ljava/lang/Object;Landroidx/compose/runtime/taiyuan;I)Ljava/lang/Object;", "p2", "p3", "p4", "marial", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/taiyuan;I)Ljava/lang/Object;", "kowloon", "I", "getKey", "()I", "arytenoidectomy", "Z", "monoploid", "Ljava/lang/Object;", "_block", "Landroidx/compose/runtime/hardpan;", "polloi", "Landroidx/compose/runtime/hardpan;", "scope", "", "molybdenite", "Ljava/util/List;", "scopes", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposableLambdaImpl implements attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final boolean tracked;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final int key;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public List<hardpan> scopes;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Object _block;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public hardpan scope;

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposableLambda.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<taiyuan, Integer, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(taiyuan taiyuanVar, Integer num) {
            invoke(taiyuanVar, num.intValue());
            return Unit.f29295attabal;
        }

        public final void invoke(taiyuan taiyuanVar, int i) {
            ((ComposableLambdaImpl) this.receiver).dern(taiyuanVar, i);
        }
    }

    public ComposableLambdaImpl(int i, boolean z, Object obj) {
        this.key = i;
        this.tracked = z;
        this._block = obj;
    }

    public static final Unit beachfront(ComposableLambdaImpl composableLambdaImpl, Object obj, int i, taiyuan taiyuanVar, int i2) {
        composableLambdaImpl.wireman(obj, taiyuanVar, outmarry.attabal(i) | 1);
        return Unit.f29295attabal;
    }

    public static final Unit competently(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i, taiyuan taiyuanVar, int i2) {
        composableLambdaImpl.marial(obj, obj2, obj3, obj4, taiyuanVar, outmarry.attabal(i) | 1);
        return Unit.f29295attabal;
    }

    public Object dern(taiyuan c, int changed) {
        taiyuan taiyuanVarAttabal = c.attabal(this.key);
        impromptu(taiyuanVarAttabal);
        int iDern = changed | (taiyuanVarAttabal.molybdenite(this) ? wireman.dern(0) : wireman.beachfront(0));
        Object obj = this._block;
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function2) rotuma.beachfront(obj, 2)).invoke(taiyuanVarAttabal, Integer.valueOf(iDern));
        licking lickingVarDern = taiyuanVarAttabal.dern();
        if (lickingVarDern != null) {
            lickingVarDern.attabal(new AnonymousClass1(this));
        }
        return objInvoke;
    }

    public final void formularize(Object block) {
        if (Intrinsics.wireman(this._block, block)) {
            return;
        }
        boolean z = this._block == null;
        this._block = block;
        if (z) {
            return;
        }
        taiyuan();
    }

    public final void impromptu(taiyuan composer) {
        hardpan hardpanVarCutely;
        if (!this.tracked || (hardpanVarCutely = composer.cutely()) == null) {
            return;
        }
        composer.monoploid(hardpanVarCutely);
        if (wireman.marial(this.scope, hardpanVarCutely)) {
            this.scope = hardpanVarCutely;
            return;
        }
        List<hardpan> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(hardpanVarCutely);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (wireman.marial(list.get(i), hardpanVarCutely)) {
                list.set(i, hardpanVarCutely);
                return;
            }
        }
        list.add(hardpanVarCutely);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(taiyuan taiyuanVar, Integer num) {
        return dern(taiyuanVar, num.intValue());
    }

    public Object marial(final Object p1, final Object p2, final Object p3, final Object p4, taiyuan c, final int changed) {
        taiyuan taiyuanVarAttabal = c.attabal(this.key);
        impromptu(taiyuanVarAttabal);
        int iDern = taiyuanVarAttabal.molybdenite(this) ? wireman.dern(4) : wireman.beachfront(4);
        Object obj = this._block;
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((monoploid) rotuma.beachfront(obj, 6)).invoke(p1, p2, p3, p4, taiyuanVarAttabal, Integer.valueOf(iDern | changed));
        licking lickingVarDern = taiyuanVarAttabal.dern();
        if (lickingVarDern != null) {
            lickingVarDern.attabal(new Function2() { // from class: cuirassed.dern
                @Override // p002kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.competently(this.f24261kowloon, p1, p2, p3, p4, changed, (androidx.compose.runtime.taiyuan) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objInvoke;
    }

    public final void taiyuan() {
        if (this.tracked) {
            hardpan hardpanVar = this.scope;
            if (hardpanVar != null) {
                hardpanVar.invalidate();
                this.scope = null;
            }
            List<hardpan> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object wireman(final Object p1, taiyuan c, final int changed) {
        taiyuan taiyuanVarAttabal = c.attabal(this.key);
        impromptu(taiyuanVarAttabal);
        int iDern = taiyuanVarAttabal.molybdenite(this) ? wireman.dern(1) : wireman.beachfront(1);
        Object obj = this._block;
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((triweekly) rotuma.beachfront(obj, 3)).invoke(p1, taiyuanVarAttabal, Integer.valueOf(iDern | changed));
        licking lickingVarDern = taiyuanVarAttabal.dern();
        if (lickingVarDern != null) {
            lickingVarDern.attabal(new Function2() { // from class: cuirassed.saneness
                @Override // p002kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ComposableLambdaImpl.beachfront(this.f24278kowloon, p1, changed, (androidx.compose.runtime.taiyuan) obj2, ((Integer) obj3).intValue());
                }
            });
        }
        return objInvoke;
    }

    @Override // tetrahedral.triweekly
    public /* bridge */ /* synthetic */ Object invoke(Object obj, taiyuan taiyuanVar, Integer num) {
        return wireman(obj, taiyuanVar, num.intValue());
    }

    @Override // tetrahedral.monoploid
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, taiyuan taiyuanVar, Integer num) {
        return marial(obj, obj2, obj3, obj4, taiyuanVar, num.intValue());
    }
}
