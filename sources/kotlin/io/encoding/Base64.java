package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "PaddingOption", "Default", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class Base64 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "", "bitsPerByte", "I", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "", "padSymbol", "B", "mimeLineLength", "mimeGroupsPerLine", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default extends Base64 {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaddingOption {
        public static final /* synthetic */ PaddingOption[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f43318Y;

        /* JADX INFO: Fake field, exist only in values array */
        PaddingOption EF5;

        static {
            PaddingOption[] paddingOptionArr = {new PaddingOption("PRESENT", 0), new PaddingOption("ABSENT", 1), new PaddingOption("PRESENT_OPTIONAL", 2), new PaddingOption("ABSENT_OPTIONAL", 3)};
            X = paddingOptionArr;
            f43318Y = EnumEntriesKt.a(paddingOptionArr);
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) X.clone();
        }
    }

    static {
        PaddingOption[] paddingOptionArr = PaddingOption.X;
        new Default(false, false);
        new Base64(true, false);
        new Base64(false, true);
    }

    public Base64(boolean z2, boolean z3) {
        PaddingOption[] paddingOptionArr = PaddingOption.X;
        if (z2 && z3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
