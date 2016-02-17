# FountChanger
this is simple Class for change your fount in application. you just have a put your <code>.ttf</code> into Asset folder then just pass this to your <b>BaseActivity</b>,<b>BaseFragment</b>and <b>BaseAdapter</b>

```@Override
public void setContentView(View view)
{
    super.setContentView(view);
    FountChanger fontChanger = new FountChanger(getAssets(), "font.otf");
    fontChanger.replaceFonts((ViewGroup)this.findViewById(android.R.id.content));
}
```
And Add following into your <b>BaseFragment</b>
```@Override
public void onActivityCreated(Bundle savedInstanceState)
{
    super.onActivityCreated(savedInstanceState);

    FountChanger fontChanger = new FountChanger(getAssets(), "font.otf");
    fontChanger.replaceFonts((ViewGroup) this.getView());
}
```
into BaseAdappter you have to add thease lines
```
if(convertView == null)
{
    convertView = inflater.inflate(R.layout.listitem, null);
    fontChanger.replaceFonts((ViewGroup)convertView);
}
```
it works fine and enjoy your code time with it.:)
