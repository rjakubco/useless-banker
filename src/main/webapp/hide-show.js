    $(document).ready(function() {
      $(document).on('click', '#showVerticalNav', function() {
        $(document.getElementById("verticalNavLayout")).removeClass("hidden");
      });
      $(document).on('click', '#hideVerticalNav', function() {
        $(document.getElementById("verticalNavLayout")).addClass("hidden");
      });
    });