package com.badlogic.gdx.maps.tiled;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.TextureLoader;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.ImageResolver;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ObjectSet;
import com.badlogic.gdx.utils.XmlReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class AtlasTmxMapLoader extends BaseTmxMapLoader<AtlasTiledMapLoaderParameters> {
    protected AtlasResolver atlasResolver;
    protected Array<Texture> trackedTextures;

    public interface AtlasResolver extends ImageResolver {

        public static class AssetManagerAtlasResolver implements AtlasResolver {
            private final AssetManager assetManager;
            private final String atlasName;

            public AssetManagerAtlasResolver(AssetManager assetManager, String str) {
                this.assetManager = assetManager;
                this.atlasName = str;
            }

            @Override // com.badlogic.gdx.maps.tiled.AtlasTmxMapLoader.AtlasResolver
            public TextureAtlas getAtlas() {
                return (TextureAtlas) this.assetManager.get(this.atlasName, TextureAtlas.class);
            }

            @Override // com.badlogic.gdx.maps.ImageResolver
            public TextureRegion getImage(String str) {
                return getAtlas().findRegion(str);
            }
        }

        public static class DirectAtlasResolver implements AtlasResolver {
            private final TextureAtlas atlas;

            public DirectAtlasResolver(TextureAtlas textureAtlas) {
                this.atlas = textureAtlas;
            }

            @Override // com.badlogic.gdx.maps.tiled.AtlasTmxMapLoader.AtlasResolver
            public TextureAtlas getAtlas() {
                return this.atlas;
            }

            @Override // com.badlogic.gdx.maps.ImageResolver
            public TextureRegion getImage(String str) {
                return this.atlas.findRegion(str);
            }
        }

        TextureAtlas getAtlas();
    }

    public static class AtlasTiledMapLoaderParameters extends BaseTiledMapLoader.Parameters {
        public boolean forceTextureFilters = false;
    }

    public AtlasTmxMapLoader() {
        super(new InternalFileHandleResolver());
        this.trackedTextures = new Array<>();
    }

    @Override // com.badlogic.gdx.maps.tiled.BaseTmxMapLoader
    public void addStaticTiles(FileHandle fileHandle, ImageResolver imageResolver, TiledMapTileSet tiledMapTileSet, XmlReader.Element element, Array<XmlReader.Element> array, String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, int i7, String str3, int i8, int i9, FileHandle fileHandle2) {
        XmlReader.Element childByName;
        int i10;
        TextureAtlas atlas = this.atlasResolver.getAtlas();
        ObjectSet.ObjectSetIterator<Texture> it = atlas.getTextures().iterator();
        while (it.hasNext()) {
            this.trackedTextures.add(it.next());
        }
        MapProperties properties = tiledMapTileSet.getProperties();
        properties.put("imagesource", str3);
        properties.put("imagewidth", Integer.valueOf(i8));
        properties.put("imageheight", Integer.valueOf(i9));
        properties.put("tilewidth", Integer.valueOf(i2));
        properties.put("tileheight", Integer.valueOf(i3));
        properties.put("margin", Integer.valueOf(i5));
        properties.put("spacing", Integer.valueOf(i4));
        if (str3 != null && str3.length() > 0) {
            int i11 = (((i9 / i3) * (i8 / i2)) + i) - 1;
            Array.ArrayIterator<TextureAtlas.AtlasRegion> it2 = atlas.findRegions(str).iterator();
            while (it2.hasNext()) {
                TextureAtlas.AtlasRegion next = it2.next();
                if (next != null && (i10 = i + next.index) >= i && i10 <= i11) {
                    addStaticTiledMapTile(tiledMapTileSet, next, i10, i6, i7);
                }
            }
        }
        Array.ArrayIterator<XmlReader.Element> it3 = array.iterator();
        while (it3.hasNext()) {
            XmlReader.Element next2 = it3.next();
            int intAttribute = next2.getIntAttribute("id", 0) + i;
            if (tiledMapTileSet.getTile(intAttribute) == null && (childByName = next2.getChildByName("image")) != null) {
                String attribute = childByName.getAttribute("source");
                String strSubstring = attribute.substring(0, attribute.lastIndexOf(46));
                TextureRegion textureRegionFindRegion = atlas.findRegion(strSubstring);
                if (textureRegionFindRegion == null) {
                    throw new GdxRuntimeException(AbstractC3888ke0.i("Tileset atlasRegion not found: ", strSubstring));
                }
                addStaticTiledMapTile(tiledMapTileSet, textureRegionFindRegion, intAttribute, i6, i7);
            }
        }
    }

    public FileHandle getAtlasFileHandle(FileHandle fileHandle) {
        String attribute;
        XmlReader.Element childByName = this.root.getChildByName("properties");
        if (childByName == null) {
            attribute = null;
            break;
        }
        Array.ArrayIterator<XmlReader.Element> it = childByName.getChildrenByName("property").iterator();
        while (true) {
            if (!it.hasNext()) {
                attribute = null;
                break;
            }
            XmlReader.Element next = it.next();
            if (next.getAttribute("name").startsWith("atlas")) {
                attribute = next.getAttribute(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                break;
            }
        }
        if (attribute == null) {
            throw new GdxRuntimeException("The map is missing the 'atlas' property");
        }
        FileHandle relativeFileHandle = BaseTiledMapLoader.getRelativeFileHandle(fileHandle, attribute);
        if (relativeFileHandle.exists()) {
            return relativeFileHandle;
        }
        throw new GdxRuntimeException(DM.B("The 'atlas' file could not be found: '", attribute, "'"));
    }

    @Override // com.badlogic.gdx.maps.tiled.BaseTiledMapLoader
    public Array<AssetDescriptor> getDependencyAssetDescriptors(FileHandle fileHandle, TextureLoader.TextureParameter textureParameter) {
        Array<AssetDescriptor> array = new Array<>();
        FileHandle atlasFileHandle = getAtlasFileHandle(fileHandle);
        if (atlasFileHandle != null) {
            array.add(new AssetDescriptor(atlasFileHandle, TextureAtlas.class));
        }
        return array;
    }

    public TiledMap load(String str) {
        return load(str, new AtlasTiledMapLoaderParameters());
    }

    public void setTextureFilters(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2) {
        Array.ArrayIterator<Texture> it = this.trackedTextures.iterator();
        while (it.hasNext()) {
            it.next().setFilter(textureFilter, textureFilter2);
        }
        this.trackedTextures.clear();
    }

    public TiledMap load(String str, AtlasTiledMapLoaderParameters atlasTiledMapLoaderParameters) {
        FileHandle fileHandleResolve = resolve(str);
        this.root = this.xml.parse(fileHandleResolve);
        TextureAtlas textureAtlas = new TextureAtlas(getAtlasFileHandle(fileHandleResolve));
        AtlasResolver.DirectAtlasResolver directAtlasResolver = new AtlasResolver.DirectAtlasResolver(textureAtlas);
        this.atlasResolver = directAtlasResolver;
        TiledMap tiledMapLoadTiledMap = loadTiledMap(fileHandleResolve, atlasTiledMapLoaderParameters, directAtlasResolver);
        tiledMapLoadTiledMap.setOwnedResources(new Array<>(new TextureAtlas[]{textureAtlas}));
        setTextureFilters(atlasTiledMapLoaderParameters.textureMinFilter, atlasTiledMapLoaderParameters.textureMagFilter);
        return tiledMapLoadTiledMap;
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public void loadAsync(AssetManager assetManager, String str, FileHandle fileHandle, AtlasTiledMapLoaderParameters atlasTiledMapLoaderParameters) {
        AtlasResolver.AssetManagerAtlasResolver assetManagerAtlasResolver = new AtlasResolver.AssetManagerAtlasResolver(assetManager, getAtlasFileHandle(fileHandle).path());
        this.atlasResolver = assetManagerAtlasResolver;
        this.map = loadTiledMap(fileHandle, atlasTiledMapLoaderParameters, assetManagerAtlasResolver);
    }

    @Override // com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader
    public TiledMap loadSync(AssetManager assetManager, String str, FileHandle fileHandle, AtlasTiledMapLoaderParameters atlasTiledMapLoaderParameters) {
        if (atlasTiledMapLoaderParameters != null) {
            setTextureFilters(atlasTiledMapLoaderParameters.textureMinFilter, atlasTiledMapLoaderParameters.textureMagFilter);
        }
        return this.map;
    }

    public AtlasTmxMapLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.trackedTextures = new Array<>();
    }
}
