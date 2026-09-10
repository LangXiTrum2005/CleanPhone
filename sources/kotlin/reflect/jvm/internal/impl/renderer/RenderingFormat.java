package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public enum RenderingFormat {
    X { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public final String b(String string) {
            Intrinsics.f(string, "string");
            return string;
        }
    },
    f44274Y { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public final String b(String string) {
            Intrinsics.f(string, "string");
            return StringsKt.I(StringsKt.I(string, "<", "&lt;"), ">", "&gt;");
        }
    };

    public abstract String b(String str);
}
