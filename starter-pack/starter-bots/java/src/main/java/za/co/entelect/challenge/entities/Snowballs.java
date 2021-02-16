package za.co.entelect.challenge.entities;

import com.google.gson.annotations.SerializedName;

public class Snowballs{
    @SerializedName("freezeRadius")
    public int freezeRadius;

    @SerializedName("range")
    public int range;

    @SerializedName("count")
    public int count;

    @SerializedName("freezeDuration")
    public int freezeDuration;
}
