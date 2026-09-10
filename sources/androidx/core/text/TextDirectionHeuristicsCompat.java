package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class TextDirectionHeuristicsCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f4397a = new TextDirectionHeuristicInternal(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f4398b = new TextDirectionHeuristicInternal(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextDirectionHeuristicCompat f4399c;
    public static final TextDirectionHeuristicCompat d;

    public static class AnyStrong implements TextDirectionAlgorithm {
    }

    public static class FirstStrong implements TextDirectionAlgorithm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FirstStrong f4400a = new FirstStrong();
    }

    public interface TextDirectionAlgorithm {
    }

    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FirstStrong f4401a;

        public TextDirectionHeuristicImpl(FirstStrong firstStrong) {
            this.f4401a = firstStrong;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public final boolean a(CharSequence charSequence, int i2) {
            if (charSequence == null || i2 < 0 || charSequence.length() - i2 < 0) {
                throw new IllegalArgumentException();
            }
            if (this.f4401a == null) {
                return b();
            }
            char c2 = 0;
            c2 = 2;
            for (int i3 = 0; i3 < i2 && c2 == 2; i3++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i3));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f4397a;
                if (directionality == 0) {
                    c2 = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            c2 = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            continue;
                    }
                }
            }
            if (c2 == 0) {
                return true;
            }
            if (c2 != 1) {
                return b();
            }
            return false;
        }

        public abstract boolean b();
    }

    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4402b;

        public TextDirectionHeuristicInternal(FirstStrong firstStrong, boolean z2) {
            super(firstStrong);
            this.f4402b = z2;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            return this.f4402b;
        }
    }

    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.f4400a;
        f4399c = new TextDirectionHeuristicInternal(firstStrong, false);
        d = new TextDirectionHeuristicInternal(firstStrong, true);
    }
}
