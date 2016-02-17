/**
*create by windows(21/12/2015)
*/

public class FontChanger
{
    private Typeface typeface;

    public FontChanger(Typeface typeface)
    {
        this.typeface = typeface;
    }

    public FontChanger(AssetManager assets, String assetsFontFileName)
    {
        typeface = Typeface.createFromAsset(assets, assetsFontFileName);
    }

    public void replaceFonts(ViewGroup viewTree)
    {
        View child;
        for(int i = 0; i < viewTree.getChildCount(); ++i)
        {
            child = viewTree.getChildAt(i);
            if(child instanceof ViewGroup)
            {
                // recursive call
                replaceFonts((ViewGroup)child);
            }
            else if(child instanceof TextView)
            {
                // base case
                ((TextView) child).setTypeface(typeface);
            }
        }
    }
}
