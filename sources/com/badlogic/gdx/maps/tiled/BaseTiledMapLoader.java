package com.badlogic.gdx.maps.tiled;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.TextureLoader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.ImageResolver;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.maps.tiled.BaseTiledMapLoader.Parameters;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.IntMap;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.Null;
import com.badlogic.gdx.utils.ObjectMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Iterator;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTiledMapLoader<P extends Parameters> extends AsynchronousAssetLoader<TiledMap, P> {
    protected static final int FLAG_FLIP_DIAGONALLY = 536870912;
    protected static final int FLAG_FLIP_HORIZONTALLY = Integer.MIN_VALUE;
    protected static final int FLAG_FLIP_VERTICALLY = 1073741824;
    protected static final int MASK_CLEAR = -536870912;
    protected boolean convertObjectToTileSpace;
    protected boolean flipY;
    protected IntMap<MapObject> idToObject;
    protected TiledMap map;
    protected int mapHeightInPixels;
    protected int mapTileHeight;
    protected int mapTileWidth;
    protected int mapWidthInPixels;
    protected ObjectMap<String, Array<ProjectClassMember>> projectClassInfo;
    protected Array<Runnable> runOnEndOfLoadTiled;

    public static class Parameters extends AssetLoaderParameters<TiledMap> {
        public boolean convertObjectToTileSpace;
        public boolean flipY;
        public boolean generateMipMaps = false;
        public String projectFilePath;
        public Texture.TextureFilter textureMagFilter;
        public Texture.TextureFilter textureMinFilter;

        public Parameters() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.textureMinFilter = textureFilter;
            this.textureMagFilter = textureFilter;
            this.convertObjectToTileSpace = false;
            this.flipY = true;
            this.projectFilePath = null;
        }
    }

    public static class ProjectClassMember {
        public JsonValue defaultValue;
        public String name;
        public String propertyType;
        public String type;

        public String toString() {
            return "ProjectClassMember{name='" + this.name + "', type='" + this.type + "', propertyType='" + this.propertyType + "', defaultValue=" + this.defaultValue + "}";
        }
    }

    public BaseTiledMapLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.flipY = true;
    }

    public static FileHandle getRelativeFileHandle(FileHandle fileHandle, String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "\\/");
        FileHandle fileHandleParent = fileHandle.parent();
        while (stringTokenizer.hasMoreElements()) {
            String strNextToken = stringTokenizer.nextToken();
            fileHandleParent = strNextToken.equals("..") ? fileHandleParent.parent() : fileHandleParent.child(strNextToken);
        }
        return fileHandleParent;
    }

    public static String tiledColorToLibGDXColor(String str) {
        return DM.h(str.length() == 9 ? str.substring(3) : str.substring(1), str.length() == 9 ? str.substring(1, 3) : "ff");
    }

    public static int unsignedByteToInt(byte b) {
        return b & 255;
    }

    public void addStaticTiledMapTile(TiledMapTileSet tiledMapTileSet, TextureRegion textureRegion, int i, float f, float f2) {
        StaticTiledMapTile staticTiledMapTile = new StaticTiledMapTile(textureRegion);
        staticTiledMapTile.setId(i);
        staticTiledMapTile.setOffsetX(f);
        if (this.flipY) {
            f2 = -f2;
        }
        staticTiledMapTile.setOffsetY(f2);
        tiledMapTileSet.putTile(i, staticTiledMapTile);
    }

    public Object castProperty(String str, String str2, String str3) {
        if (str3 == null || TypedValues.Custom.S_STRING.equals(str3) || "file".equals(str3)) {
            return str2;
        }
        if (str3.equals("int")) {
            return Integer.valueOf(str2);
        }
        if (str3.equals(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(str2);
        }
        if (str3.equals("bool")) {
            return Boolean.valueOf(str2);
        }
        if (str3.equals("color")) {
            return Color.valueOf(tiledColorToLibGDXColor(str2));
        }
        throw new GdxRuntimeException(AbstractC5044xl.n("Wrong type given for property ", str, ", given : ", str3, ", supported : string, file, bool, int, float, color"));
    }

    public TiledMapTileLayer.Cell createTileLayerCell(boolean z, boolean z2, boolean z3) {
        TiledMapTileLayer.Cell cell = new TiledMapTileLayer.Cell();
        if (!z3) {
            cell.setFlipHorizontally(z);
            cell.setFlipVertically(z2);
        } else if (z && z2) {
            cell.setFlipHorizontally(true);
            cell.setRotation(3);
        } else if (z) {
            cell.setRotation(3);
        } else if (z2) {
            cell.setRotation(1);
        } else {
            cell.setFlipVertically(true);
            cell.setRotation(3);
        }
        return cell;
    }

    public abstract Array<AssetDescriptor> getDependencyAssetDescriptors(FileHandle fileHandle, TextureLoader.TextureParameter textureParameter);

    @Null
    public IntMap<MapObject> getIdToObject() {
        return this.idToObject;
    }

    public void loadBasicProperty(MapProperties mapProperties, String str, String str2, String str3) {
        mapProperties.put(str, castProperty(str, str2, str3));
    }

    public void loadJsonClassProperties(String str, MapProperties mapProperties, JsonValue jsonValue) {
        ObjectMap<String, Array<ProjectClassMember>> objectMap = this.projectClassInfo;
        if (objectMap == null) {
            throw new GdxRuntimeException("No class information loaded to support class properties. Did you set the 'projectFilePath' parameter?");
        }
        if (objectMap.isEmpty()) {
            throw new GdxRuntimeException("No class information available. Did you set the correct Tiled project path in the 'projectFilePath' parameter?");
        }
        Array<ProjectClassMember> array = this.projectClassInfo.get(str);
        if (array == null) {
            throw new GdxRuntimeException(DM.B("There is no class with name '", str, "' in given Tiled project file."));
        }
        Array.ArrayIterator<ProjectClassMember> it = array.iterator();
        while (it.hasNext()) {
            ProjectClassMember next = it.next();
            String str2 = next.name;
            JsonValue jsonValue2 = jsonValue.get(str2);
            String str3 = next.type;
            str3.getClass();
            if (str3.equals("object")) {
                loadObjectProperty(mapProperties, str2, jsonValue2 == null ? next.defaultValue.asString() : jsonValue2.asString());
            } else if (str3.equals("class")) {
                if (jsonValue2 == null) {
                    jsonValue2 = next.defaultValue;
                }
                MapProperties mapProperties2 = new MapProperties();
                String str4 = next.propertyType;
                mapProperties2.put("type", str4);
                mapProperties.put(str2, mapProperties2);
                loadJsonClassProperties(str4, mapProperties2, jsonValue2);
            } else {
                if (jsonValue2 == null) {
                    jsonValue2 = next.defaultValue;
                }
                loadBasicProperty(mapProperties, str2, jsonValue2.asString(), next.type);
            }
        }
    }

    public void loadObjectProperty(final MapProperties mapProperties, final String str, String str2) {
        try {
            final int i = Integer.parseInt(str2);
            this.runOnEndOfLoadTiled.add(new Runnable() { // from class: com.badlogic.gdx.maps.tiled.BaseTiledMapLoader.1
                @Override // java.lang.Runnable
                public void run() {
                    mapProperties.put(str, BaseTiledMapLoader.this.idToObject.get(i));
                }
            });
        } catch (Exception e) {
            throw new GdxRuntimeException(DM.B("Error parsing property [\" + name + \"] of type \"object\" with value: [", str2, "]"), e);
        }
    }

    public void loadProjectFile(String str) {
        this.projectClassInfo = new ObjectMap<>();
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        JsonValue jsonValue = new JsonReader().parse(resolve(str)).get("propertyTypes");
        if (jsonValue == null) {
            return;
        }
        Iterator<JsonValue> itIterator2 = jsonValue.iterator2();
        while (itIterator2.hasNext()) {
            JsonValue next = itIterator2.next();
            if ("class".equals(next.getString("type"))) {
                String string = next.getString("name");
                JsonValue jsonValue2 = next.get("members");
                if (!jsonValue2.isEmpty()) {
                    Array<ProjectClassMember> array = new Array<>();
                    this.projectClassInfo.put(string, array);
                    Iterator<JsonValue> itIterator3 = jsonValue2.iterator2();
                    while (itIterator3.hasNext()) {
                        JsonValue next2 = itIterator3.next();
                        ProjectClassMember projectClassMember = new ProjectClassMember();
                        projectClassMember.name = next2.getString("name");
                        projectClassMember.type = next2.getString("type");
                        projectClassMember.propertyType = next2.getString("propertyType", null);
                        projectClassMember.defaultValue = next2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        array.add(projectClassMember);
                    }
                }
            }
        }
    }

    public abstract TiledMap loadTiledMap(FileHandle fileHandle, P p, ImageResolver imageResolver);
}
