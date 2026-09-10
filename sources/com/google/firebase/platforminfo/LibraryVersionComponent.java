package com.google.firebase.platforminfo;

import A.C0880a0;
import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;

/* JADX INFO: loaded from: classes4.dex */
public class LibraryVersionComponent {

    public interface VersionExtractor<T> {
        String e(Context context);
    }

    public static Component a(String str, String str2) {
        AutoValue_LibraryVersion autoValue_LibraryVersion = new AutoValue_LibraryVersion(str, str2);
        Component.Builder builderB = Component.b(LibraryVersion.class);
        builderB.f20205e = 1;
        builderB.f = new C0880a0(autoValue_LibraryVersion, 17);
        return builderB.b();
    }

    public static Component b(final String str, final VersionExtractor versionExtractor) {
        Component.Builder builderB = Component.b(LibraryVersion.class);
        builderB.f20205e = 1;
        builderB.a(Dependency.b(Context.class));
        builderB.f = new ComponentFactory() { // from class: com.google.firebase.platforminfo.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object b(ComponentContainer componentContainer) {
                return new AutoValue_LibraryVersion(str, versionExtractor.e((Context) componentContainer.a(Context.class)));
            }
        };
        return builderB.b();
    }
}
