package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.SynchronousAssetLoader;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.EarClippingTriangulator;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.StreamUtils;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class PolygonRegionLoader extends SynchronousAssetLoader<PolygonRegion, PolygonRegionParameters> {
    private PolygonRegionParameters defaultParameters;
    private EarClippingTriangulator triangulator;

    public static class PolygonRegionParameters extends AssetLoaderParameters<PolygonRegion> {
        public String texturePrefix = "i ";
        public int readerBuffer = 1024;
        public String[] textureExtensions = {"png", "PNG", "jpeg", "JPEG", "jpg", "JPG", "cim", "CIM", "etc1", "ETC1", "ktx", "KTX", "zktx", "ZKTX"};
    }

    public PolygonRegionLoader() {
        this(new InternalFileHandleResolver());
    }

    public PolygonRegionLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.defaultParameters = new PolygonRegionParameters();
        this.triangulator = new EarClippingTriangulator();
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, PolygonRegionParameters polygonRegionParameters) {
        String strName;
        String[] strArr;
        if (polygonRegionParameters == null) {
            polygonRegionParameters = this.defaultParameters;
        }
        try {
            BufferedReader erVar = fileHandle.reader(polygonRegionParameters.readerBuffer);
            while (true) {
                String line = erVar.readLine();
                if (line == null) {
                    strName = null;
                    break;
                }
                if (line.startsWith(polygonRegionParameters.texturePrefix)) {
                    strName = line.substring(polygonRegionParameters.texturePrefix.length());
                    break;
                }
            }
            erVar.close();
            if (strName == null && (strArr = polygonRegionParameters.textureExtensions) != null) {
                for (String str2 : strArr) {
                    FileHandle fileHandleSibling = fileHandle.sibling(fileHandle.nameWithoutExtension().concat("." + str2));
                    if (fileHandleSibling.exists()) {
                        strName = fileHandleSibling.name();
                    }
                }
            }
            if (strName == null) {
                return null;
            }
            Array<AssetDescriptor> array = new Array<>(1);
            array.add(new AssetDescriptor(fileHandle.sibling(strName), Texture.class));
            return array;
        } catch (IOException e) {
            throw new GdxRuntimeException(AbstractC3888ke0.i("Error reading ", str), e);
        }
    }

    @Override // com.badlogic.gdx.assets.loaders.SynchronousAssetLoader
    public PolygonRegion load(AssetManager assetManager, String str, FileHandle fileHandle, PolygonRegionParameters polygonRegionParameters) {
        return load(new TextureRegion((Texture) assetManager.get(assetManager.getDependencies(str).first())), fileHandle);
    }

    public PolygonRegion load(TextureRegion textureRegion, FileHandle fileHandle) {
        String line;
        BufferedReader erVar = fileHandle.reader(256);
        do {
            try {
                try {
                    line = erVar.readLine();
                    if (line == null) {
                        StreamUtils.closeQuietly(erVar);
                        throw new GdxRuntimeException(AbstractC5044xl.k("Polygon shape not found: ", fileHandle));
                    }
                } catch (IOException e) {
                    throw new GdxRuntimeException("Error reading polygon shape file: " + fileHandle, e);
                }
            } catch (Throwable th) {
                StreamUtils.closeQuietly(erVar);
                throw th;
            }
        } while (!line.startsWith(bc.aH));
        String[] strArrSplit = line.substring(1).trim().split(",");
        int length = strArrSplit.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = Float.parseFloat(strArrSplit[i]);
        }
        PolygonRegion polygonRegion = new PolygonRegion(textureRegion, fArr, this.triangulator.computeTriangles(fArr).toArray());
        StreamUtils.closeQuietly(erVar);
        return polygonRegion;
    }
}
