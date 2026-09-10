package p002kotlin.text;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlin.text.marial, reason: from toString */
/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0003\r\u0015\u0011B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlin/text/marial;", "", "", "upperCase", "Lkotlin/text/marial$attabal;", "bytes", "Lkotlin/text/marial$dern;", "number", "<init>", "(ZLkotlin/text/marial$attabal;Lkotlin/text/marial$dern;)V", "", "toString", "()Ljava/lang/String;", "attabal", "Z", "getUpperCase", "()Z", "saneness", "Lkotlin/text/marial$attabal;", "getBytes", "()Lkotlin/text/marial$attabal;", "dern", "Lkotlin/text/marial$dern;", "()Lkotlin/text/marial$dern;", "wireman", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HexFormat {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final HexFormat f32023beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final HexFormat f32024marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean upperCase;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final NumberHexFormat number;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final BytesHexFormat bytes;

    /* JADX INFO: renamed from: kotlin.text.marial$attabal, reason: from toString */
    /* JADX INFO: compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0001\u0014B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\rR\u001a\u0010'\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001a\u0010-\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&¨\u0006/"}, d2 = {"Lkotlin/text/marial$attabal;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "saneness", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "attabal", "I", "getBytesPerLine", "()I", "getBytesPerGroup", "dern", "Ljava/lang/String;", "getGroupSeparator", "wireman", "getByteSeparator", "marial", "getBytePrefix", "beachfront", "getByteSuffix", "", "competently", "Z", "getNoLineAndGroupSeparator$kotlin_stdlib", "()Z", "noLineAndGroupSeparator", "impromptu", "getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib", "shortByteSeparatorNoPrefixAndSuffix", "taiyuan", "getIgnoreCase$kotlin_stdlib", "ignoreCase", "cutely", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int bytesPerLine;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final String byteSuffix;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public final boolean noLineAndGroupSeparator;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final String groupSeparator;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public final boolean shortByteSeparatorNoPrefixAndSuffix;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final String bytePrefix;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final int bytesPerGroup;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
        public final boolean ignoreCase;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final String byteSeparator;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static final BytesHexFormat f32029apical = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: kotlin.text.marial$attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/marial$attabal$attabal;", "", "<init>", "()V", "Lkotlin/text/marial$attabal;", "Default", "Lkotlin/text/marial$attabal;", "attabal", "()Lkotlin/text/marial$attabal;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BytesHexFormat attabal() {
                return BytesHexFormat.f32029apical;
            }

            public Companion() {
            }
        }

        public BytesHexFormat(int i, int i2, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.bytesPerLine = i;
            this.bytesPerGroup = i2;
            this.groupSeparator = groupSeparator;
            this.byteSeparator = byteSeparator;
            this.bytePrefix = bytePrefix;
            this.byteSuffix = byteSuffix;
            this.noLineAndGroupSeparator = i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE;
            this.shortByteSeparatorNoPrefixAndSuffix = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.ignoreCase = beachfront.saneness(groupSeparator) || beachfront.saneness(byteSeparator) || beachfront.saneness(bytePrefix) || beachfront.saneness(byteSuffix);
        }

        public final StringBuilder saneness(StringBuilder sb, String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.bytesPerLine);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.bytesPerGroup);
            sb.append(",");
            sb.append('\n');
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.groupSeparator);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.byteSeparator);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.bytePrefix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.byteSuffix);
            sb.append("\"");
            return sb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            saneness(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.marial$dern, reason: from toString */
    /* JADX INFO: compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 &2\u00020\u0001:\u0001\u0013B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00060\rj\u0002`\u000e2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010#\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010%\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006'"}, d2 = {"Lkotlin/text/marial$dern;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "saneness", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "attabal", "Ljava/lang/String;", "wireman", "marial", "dern", "Z", "getRemoveLeadingZeros", "()Z", "I", "getMinLength", "()I", "getMinLength$annotations", "()V", "beachfront", "isDigitsOnly", "isDigitsOnlyAndNoPadding$kotlin_stdlib", "isDigitsOnlyAndNoPadding", "competently", "ignoreCase", "impromptu", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final NumberHexFormat f32041taiyuan = new NumberHexFormat("", "", false, 1);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final String prefix;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public final boolean isDigitsOnlyAndNoPadding;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public final boolean ignoreCase;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final boolean removeLeadingZeros;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public final boolean isDigitsOnly;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final String suffix;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final int minLength;

        /* JADX INFO: renamed from: kotlin.text.marial$dern$attabal, reason: from kotlin metadata */
        /* JADX INFO: compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/marial$dern$attabal;", "", "<init>", "()V", "Lkotlin/text/marial$dern;", "Default", "Lkotlin/text/marial$dern;", "attabal", "()Lkotlin/text/marial$dern;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NumberHexFormat attabal() {
                return NumberHexFormat.f32041taiyuan;
            }

            public Companion() {
            }
        }

        public NumberHexFormat(String prefix, String suffix, boolean z, int i) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.removeLeadingZeros = z;
            this.minLength = i;
            boolean z2 = prefix.length() == 0 && suffix.length() == 0;
            this.isDigitsOnly = z2;
            this.isDigitsOnlyAndNoPadding = z2 && i == 1;
            this.ignoreCase = beachfront.saneness(prefix) || beachfront.saneness(suffix);
        }

        /* JADX INFO: renamed from: beachfront, reason: from getter */
        public final boolean getIsDigitsOnly() {
            return this.isDigitsOnly;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final String getSuffix() {
            return this.suffix;
        }

        public final StringBuilder saneness(StringBuilder sb, String indent) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.prefix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.suffix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.removeLeadingZeros);
            sb.append(',');
            sb.append('\n');
            sb.append(indent);
            sb.append("minLength = ");
            sb.append(this.minLength);
            return sb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            saneness(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.marial$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/marial$saneness;", "", "<init>", "()V", "Lkotlin/text/marial;", "Default", "Lkotlin/text/marial;", "attabal", "()Lkotlin/text/marial;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HexFormat attabal() {
            return HexFormat.f32024marial;
        }

        public Companion() {
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.INSTANCE;
        BytesHexFormat bytesHexFormatAttabal = companion.attabal();
        NumberHexFormat.Companion companion2 = NumberHexFormat.INSTANCE;
        f32024marial = new HexFormat(false, bytesHexFormatAttabal, companion2.attabal());
        f32023beachfront = new HexFormat(true, companion.attabal(), companion2.attabal());
    }

    public HexFormat(boolean z, BytesHexFormat bytes, NumberHexFormat number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.upperCase = z;
        this.bytes = bytes;
        this.number = number;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final NumberHexFormat getNumber() {
        return this.number;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.upperCase);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.bytes.saneness(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.number.saneness(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
