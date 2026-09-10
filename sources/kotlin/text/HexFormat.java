package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/text/HexFormat;", "", "BytesHexFormat", "NumberHexFormat", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HexFormat {
    public static final HexFormat d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BytesHexFormat f44701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NumberHexFormat f44702c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BytesHexFormat f44703a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            BytesHexFormat bytesHexFormat = new BytesHexFormat();
            if (!HexFormatKt.a("  ") && !HexFormatKt.a("") && !HexFormatKt.a("")) {
                HexFormatKt.a("");
            }
            f44703a = bytesHexFormat;
        }

        public final void a(StringBuilder sb, String str) {
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            androidx.media3.extractor.text.ttml.a.C(sb, str, "bytePrefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NumberHexFormat f44704b = new NumberHexFormat();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f44705a = true;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public NumberHexFormat() {
            if (HexFormatKt.a("")) {
                return;
            }
            HexFormatKt.a("");
        }

        public final void a(StringBuilder sb, String str) {
            androidx.media3.extractor.text.ttml.a.C(sb, str, "prefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(AbstractJsonLexerKt.COMMA);
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            a(sb, "    ");
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        BytesHexFormat bytesHexFormat = BytesHexFormat.f44703a;
        NumberHexFormat numberHexFormat = NumberHexFormat.f44704b;
        d = new HexFormat(false, bytesHexFormat, numberHexFormat);
        new HexFormat(true, bytesHexFormat, numberHexFormat);
    }

    public HexFormat(boolean z2, BytesHexFormat bytes, NumberHexFormat number) {
        Intrinsics.f(bytes, "bytes");
        Intrinsics.f(number, "number");
        this.f44700a = z2;
        this.f44701b = bytes;
        this.f44702c = number;
    }

    public final String toString() {
        StringBuilder sbW = android.support.v4.media.a.w("HexFormat(\n    upperCase = ");
        sbW.append(this.f44700a);
        sbW.append(",\n    bytes = BytesHexFormat(\n");
        this.f44701b.a(sbW, "        ");
        sbW.append('\n');
        sbW.append("    ),");
        sbW.append('\n');
        sbW.append("    number = NumberHexFormat(");
        sbW.append('\n');
        this.f44702c.a(sbW, "        ");
        sbW.append('\n');
        sbW.append("    )");
        sbW.append('\n');
        sbW.append(")");
        return sbW.toString();
    }
}
