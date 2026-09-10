package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.media3.extractor.text.ttml.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class StringValue extends ConstantValue<String> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.f(module, "module");
        return module.k().t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final String toString() {
        return a.p(new StringBuilder("\""), (String) this.f44302a, AbstractJsonLexerKt.STRING);
    }
}
