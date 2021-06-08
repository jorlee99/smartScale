//public class AutoCompleteAdapter extends ArrayAdapter<Style> implements Filterable {
//    private ArrayList<Style> mData;
//
//    public AutoCompleteAdapter(Context context, int textViewResourceId) {
//        super(context, textViewResourceId);
//        mData = new ArrayList<Style>();
//    }
//
//    @Override
//    public int getCount() {
//        return mData.size();
//    }
//
//    @Override
//    public Style getItem(int index) {
//        return mData.get(index);
//    }
//
//    @Override
//    public Filter getFilter() {
//        Filter myFilter = new Filter() {
//            @Override
//            protected FilterResults performFiltering(CharSequence constraint) {
//                FilterResults filterResults = new FilterResults();
//                if(constraint != null) {
//                    // A class that queries a web API, parses the data and returns an ArrayList<Style>
//                    StyleFetcher fetcher = new StyleFetcher();
//                    try {
//                        mData = fetcher.retrieveResults(constraint.toString());
//                    }
//                    catch(Exception e) {
//                        Log.e("myException", e.getMessage());
//                    }
//                    // Now assign the values and count to the FilterResults object
//                    filterResults.values = mData;
//                    filterResults.count = mData.size();
//                }
//                return filterResults;
//            }
//
//            @Override
//            protected void publishResults(CharSequence contraint, FilterResults results) {
//                if(results != null && results.count > 0) {
//                notifyDataSetChanged();
//                }
//                else {
//                    notifyDataSetInvalidated();
//                }
//            }
//        };
//        return myFilter;
//    }
//}