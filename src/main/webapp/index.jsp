<html>
<body>
<head>


</head>
<h2>Hello World!</h2>
<button onclick="send()">SEND</button>
<script type="application/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0-alpha1/jquery.js"></script>
<script type="application/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.8.3/underscore-min.js"></script>
<script type="application/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/backbone.js/1.2.3/backbone-min.js"></script>
<script type="application/javascript">
    var MailModel = Backbone.Model.extend({
        urlRoot: "/rest/mail"
    });

    var mailModel = new MailModel({from: '', to: 'enes793k@gmail.com', subject: 'deneme', message: 'deneme message'});
    function send() {
        mailModel.save({
            success: function (mailModel_m) {
                alert("success");
            },
            error: function (err) {
                alert("error");
            }
        });
    }
</script>
</body>
</html>
