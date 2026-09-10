package com.badlogic.gdx.assets.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.I18NBundle;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class I18NBundleLoader extends AsynchronousAssetLoader<I18NBundle, I18NBundleParameter> {
    I18NBundle bundle;

    public static class I18NBundleParameter extends AssetLoaderParameters<I18NBundle> {
        public final String encoding;
        public final Locale locale;

        public I18NBundleParameter() {
            this(null, null);
        }

        public I18NBundleParameter(Locale locale) {
            this(locale, null);
        }

        public I18NBundleParameter(Locale locale, String str) {
            this.locale = locale;
            this.encoding = str;
        }
    }

    public I18NBundleLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, I18NBundleParameter i18NBundleParameter) {
        return null;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, I18NBundleParameter i18NBundleParameter) {
        Locale locale;
        String str2 = null;
        this.bundle = null;
        if (i18NBundleParameter == null) {
            locale = Locale.getDefault();
        } else {
            Locale locale2 = i18NBundleParameter.locale;
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            locale = locale2;
            str2 = i18NBundleParameter.encoding;
        }
        if (str2 == null) {
            this.bundle = I18NBundle.createBundle(fileHandle, locale);
        } else {
            this.bundle = I18NBundle.createBundle(fileHandle, locale, str2);
        }
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public I18NBundle loadSync(AssetManager assetManager, String str, FileHandle fileHandle, I18NBundleParameter i18NBundleParameter) {
        I18NBundle i18NBundle = this.bundle;
        this.bundle = null;
        return i18NBundle;
    }
}
