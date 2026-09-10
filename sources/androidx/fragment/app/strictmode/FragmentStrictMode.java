package androidx.fragment.app.strictmode;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentStrictMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Policy f5209a = Policy.f5211a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Flag {
        public static final Flag X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Flag f5210Y;
        public static final Flag Z;
        public static final Flag e0;
        public static final Flag f0;
        public static final Flag g0;
        public static final Flag h0;
        public static final /* synthetic */ Flag[] i0;

        /* JADX INFO: Fake field, exist only in values array */
        Flag EF0;

        static {
            Flag flag = new Flag("PENALTY_LOG", 0);
            Flag flag2 = new Flag("PENALTY_DEATH", 1);
            Flag flag3 = new Flag("DETECT_FRAGMENT_REUSE", 2);
            X = flag3;
            Flag flag4 = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
            f5210Y = flag4;
            Flag flag5 = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
            Z = flag5;
            Flag flag6 = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
            e0 = flag6;
            Flag flag7 = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
            f0 = flag7;
            Flag flag8 = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
            g0 = flag8;
            Flag flag9 = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            h0 = flag9;
            i0 = new Flag[]{flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) i0.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnViolationListener {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "Builder", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Policy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Policy f5211a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Companion;", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            Policy policy = new Policy();
            new LinkedHashMap();
            f5211a = policy;
        }
    }

    public static Policy a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                Intrinsics.e(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f5209a;
    }

    public static void b(Violation violation) {
        if (FragmentManager.I(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.X.getClass().getName()), violation);
        }
    }

    public static final void c(Fragment fragment, String previousFragmentId) {
        Intrinsics.f(fragment, "fragment");
        Intrinsics.f(previousFragmentId, "previousFragmentId");
        b(new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
        EmptySet.X.contains(Flag.X);
    }
}
