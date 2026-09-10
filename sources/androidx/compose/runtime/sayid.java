package androidx.compose.runtime;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotFloatState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/sayid;", "", "Landroidx/compose/runtime/czestochowa;", "", "value", "getValue", "()Ljava/lang/Float;", "impromptu", "(F)V", "dern", "()F", "formularize", "floatValue", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface sayid extends tout, czestochowa<Float> {
    float dern();

    void formularize(float f);

    default void impromptu(float f) {
        formularize(f);
    }

    @Override // androidx.compose.runtime.czestochowa
    /* bridge */ /* synthetic */ default void setValue(Float f) {
        impromptu(f.floatValue());
    }

    @Override // androidx.compose.runtime.tout, androidx.compose.runtime.czestochowa
    default Float getValue() {
        return Float.valueOf(dern());
    }
}
