package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.MergePathsContent;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MergePaths implements ContentModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MergePathsMode f9774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9775b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MergePathsMode {
        public static final MergePathsMode X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final MergePathsMode f9776Y;
        public static final MergePathsMode Z;
        public static final MergePathsMode e0;
        public static final MergePathsMode f0;
        public static final /* synthetic */ MergePathsMode[] g0;

        static {
            MergePathsMode mergePathsMode = new MergePathsMode("MERGE", 0);
            X = mergePathsMode;
            MergePathsMode mergePathsMode2 = new MergePathsMode("ADD", 1);
            f9776Y = mergePathsMode2;
            MergePathsMode mergePathsMode3 = new MergePathsMode("SUBTRACT", 2);
            Z = mergePathsMode3;
            MergePathsMode mergePathsMode4 = new MergePathsMode("INTERSECT", 3);
            e0 = mergePathsMode4;
            MergePathsMode mergePathsMode5 = new MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
            f0 = mergePathsMode5;
            g0 = new MergePathsMode[]{mergePathsMode, mergePathsMode2, mergePathsMode3, mergePathsMode4, mergePathsMode5};
        }

        public static MergePathsMode valueOf(String str) {
            return (MergePathsMode) Enum.valueOf(MergePathsMode.class, str);
        }

        public static MergePathsMode[] values() {
            return (MergePathsMode[]) g0.clone();
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z2) {
        this.f9774a = mergePathsMode;
        this.f9775b = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public final Content a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        if (lottieDrawable.o0) {
            return new MergePathsContent(this);
        }
        Logger.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f9774a + AbstractJsonLexerKt.END_OBJ;
    }
}
