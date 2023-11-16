l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goturl("https://namecompatibility.net/");
            }
});

private void goturl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
}
